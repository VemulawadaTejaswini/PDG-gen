import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
			
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] height = new int[n];
			int[] width = new int[m];
			
			for(int i = 0; i < n; i++){
				height[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i = 0; i < m; i++){
				width[i] = Integer.parseInt(br.readLine());
			}
			
			System.out.println(solve(height, width));
		}
	}
	
	static int solve(int[] height, int[] width){
		int result = 0;
		
		//長さiの辺の数
		int[] hlist = new int[1500*1000];
		int[] wlist = new int[1500*1000];
		
		//スタート地点
		for(int i = 0; i < height.length ; i++){
			int len = 0;
			//ゴール地点
			for(int j = i; j < height.length ; j++){
				len += height[j];
				hlist[len]++;
			}
		}
		
		//スタート地点
		for(int i = 0; i < width.length ; i++){
			int len = 0;
			//ゴール地点
			for(int j = i; j < width.length ; j++){
				len += width[j];
				wlist[len]++;
			}
		}
		
		for(int i = 0; i < wlist.length ; i++){
			result += wlist[i]*hlist[i];
		}
		return result;
	}

}

