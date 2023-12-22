import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		int n = Integer.valueOf(reader.readLine());
		int m = Integer.valueOf(reader.readLine());
		int map[][] = new int[n][n], now, cost = 0;
		
		for(int i = 0; i < m; i++){
			int a[] = app.splitter(reader.readLine().toString());
			map[a[0] - 1][a[1] - 1] = a[2];
			map[a[1] - 1][a[0] - 1] = a[3];
		}
		int a[] = app.splitter(reader.readLine());
		
		cost = a[2];
		for(int i = 0; i < 2; i++){
			ArrayDeque<int[]> que = new ArrayDeque<int[]>();
			boolean visit[] = new boolean[n];
			visit[a[i] - 1] = true;
			que.addLast(new int[]{a[i] - 1, cost});
			while(!que.isEmpty()){
				now = que.getFirst()[0];
				cost = que.getFirst()[1];
				que.removeFirst();
				
				if(now == a[i == 0 ? 1 : 0]) break;
				
				for(int j = 0; j < map[now].length; j++){
					if(map[now][j] > 0 && !visit[j]){
						cost -= map[now][j];
						que.addLast(new int[]{j, cost});
					}
				}
			}
		}
		System.out.println(cost - a[3]);
		reader.close();
	}
	
	public int[] splitter(String source){
		String str[] = source.split(",");
		int array[] = new int[str.length];
		for(int i = 0; i < str.length; i++){
			array[i] = Integer.valueOf(str[i]);
		}
		return array;
	}
	
}