

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		
		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\b\\tt"));
//		long start = System.currentTimeMillis();
//		System.out.println(Integer.MAX_VALUE);
		 
		//strat
		//B - ID  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] P = new int[N+1];
		int[][] arr = new int[4][M+1];//0 保存原值P，1保存原值Y， 2排序， 3州内顺序
		
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[0][i]=p;
			arr[1][i]=y;
			arr[2][i]=y;
		}
		
		
		Arrays.sort(arr[2]);
		
		// 效率太低
		for (int i = 1; i <= M; i++) {
			int idx = arr[2][i];
			for (int j = 1; j <= M; j++) {
				int idx1 = arr[1][j];
				if(idx1==idx) {
					arr[3][j] = ++P[arr[0][j]];
					break;
				}
			}
			
		}
		
		for (int i = 1; i <= M; i++) {
			System.out.format("%06d%06d\n", arr[0][i],arr[3][i]);
		}
		
		
		//end
//		long end = System.currentTimeMillis();
//		System.out.format("%.3f  ms", (end-start)/1000.0);
	}

}
