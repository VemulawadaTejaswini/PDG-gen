import java.util.*;

public class Main {
	int[][] matrix;
	int n, m;
	
	void print(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j!=0) System.out.print(" ");
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	void Rotate(int r, int c, int size, int angle){
		int[][] temp = new int[size][size];
		for(int k=0;k<angle/90;k++){
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					temp[i][j] = matrix[r+i][c+j];
				}
			}
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					matrix[r+i][c+j] = temp[size-1-j][i];
				}
			}
		}
	}
	
	void Island(int r, int c){
		int p = matrix[r][c];
		int py = r;
		int px = c;
		int[] a = new int[]{0,0,1,-1};
		int[] b = new int[]{1,-1,0,0};
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		y.add(r);
		x.add(c);
		while(y.size()!=0){
			py = y.poll();
			px = x.poll();
			if(matrix[py][px]==0) matrix[py][px] = 1;
			else matrix[py][px] = 0;
			for(int i=0;i<4;i++){
				if(0<=py+a[i] && py+a[i]<=n-1 && 0<=px+b[i] && px+b[i]<=n-1){
					if(matrix[py+a[i]][px+b[i]]==p){
						y.offer(py+a[i]);
						x.offer(px+b[i]);
					}
				}
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		matrix = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			int o = sc.nextInt();
			int r = sc.nextInt()-1;
			if(o==0){
				int c = sc.nextInt()-1;
				int size = sc.nextInt();
				int angle = sc.nextInt();
				if(angle==90 || angle==180 || angle==270) Rotate(r, c, size, angle);
			}else if(o==1){
				int c = sc.nextInt()-1;
				int size = sc.nextInt();
				for(int j=0;j<size;j++){
					for(int k=0;k<size;k++){
						if(matrix[r+j][c+k]==0) matrix[r+j][c+k] = 1;
						else matrix[r+j][c+k] = 0;
					}
				}
			}else if(o==2){
				int temp = matrix[r][0];
				for(int j=0;j<n-1;j++) matrix[r][j] = matrix[r][j+1];
				matrix[r][n-1] = temp;
			}else if(o==3){
				int temp = matrix[r][n-1];
				for(int j=n-1;j>0;j--) matrix[r][j] = matrix[r][j-1];
				matrix[r][0] = temp;
			}else if(o==4){
				int c = sc.nextInt()-1;
				Island(r, c);
			}
		}
		print();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}