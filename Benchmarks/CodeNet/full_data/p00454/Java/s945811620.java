import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int w = Integer.parseInt(tmpArray[0]);
			int h = Integer.parseInt(tmpArray[1]);
			
			if(w == 0 && h == 0){
				break;
			}

			int n = Integer.parseInt(br.readLine());

			int x1[] = new int[n];
			int x2[] = new int[n];
			int y1[] = new int[n];
			int y2[] = new int[n];

			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				x1[i] = Integer.parseInt(tmpArray[0]);
				y1[i] = Integer.parseInt(tmpArray[1]);
				x2[i] = Integer.parseInt(tmpArray[2]);
				y2[i] = Integer.parseInt(tmpArray[3]);

			}

			solve(x1, y1, x2, y2, w, h);
		}
	}
	
	static void solve(int[] x1, int[] y1, int[] x2, int[] y2, int w, int h){
		int n = x1.length;

		//座標を圧縮しておく
		w = compress(x1, x2, w);
		h = compress(y1, y2, h);
		
		boolean matrix[][] = new boolean[h][w];
		
		//圧縮後の座標を使って染める
		for(int i = 0; i < n; i++){
			paint(matrix, x1[i], y1[i], x2[i], y2[i]);
		}
		
		//BFSで領域数を数える（同じことをDFSでやると多分危険）
		long result = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(matrix[i][j] == WHITE){
					visitWithBFS(matrix, j, i);
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
	
	static final boolean WHITE = false;
	static final boolean BLACK = true;
	
	//座標圧縮。返り値は圧縮後の最大値
	static int compress(int[] array1, int[] array2, int limit){
		int n = array1.length;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		//重要なのはオリジナルの座標とその前後
		int d[] = {-1, 0, 1};
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= 2; j++){
				int tmp1 = array1[i] + d[j];
				int tmp2 = array2[i] + d[j];
				
				if(j != 2 && tmp1 >= 0 && tmp1 <= limit){
					set.add(tmp1);
				}
				if(j != 0 && tmp2 >= 0 && tmp2 <= limit){
					set.add(tmp2);
				}
				
			}
		}
		
		int size = set.size();
		int compressedData[] = new int[size];
		
		int index = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			compressedData[index++] = it.next();
		}
		
		Arrays.sort(compressedData);
		
		//インデックスが圧縮後の座標となる
		for(int i = 0; i < n; i++){
			array1[i] = Arrays.binarySearch(compressedData, array1[i]);
			array2[i] = Arrays.binarySearch(compressedData, array2[i]);
		}
		
		return size - 1;
	}

	static void visitWithBFS(boolean matrix[][], int x, int y){
		ArrayDeque<Point> que = new ArrayDeque<Point>();
		
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		
		que.add(new Point(x, y));
		matrix[y][x] = BLACK;
		while(!que.isEmpty()){
			Point tmpPoint = que.removeFirst();
			//四方向
			for(int i = 0; i < 4; i++){
				int newX = tmpPoint.x + dx[i];
				int newY = tmpPoint.y + dy[i];
				
				if(newX >= 0 && newX < matrix[0].length && 
						newY >= 0 && newY < matrix.length &&
						matrix[newY][newX] == WHITE){
					que.add(new Point(newX, newY));
					matrix[newY][newX] = BLACK;
					
				}
			}
		}
	}
	
	static void paint(boolean[][] matrix, int x1, int y1, int x2, int y2){
		for(int i = y1; i < y2 ; i++){
			for(int j = x1; j < x2 ; j++){
				matrix[i][j] = BLACK;
			}
		}
	}	
}

class Point {
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}	
}
