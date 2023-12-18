import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] xy = new int[N][2];
		for(int i = 0; i<N; i++) {
			String[] in = br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(in[0]);
			xy[i][1] = Integer.parseInt(in[1]);
		}
		
		double sum = 0;
		
		for(int j=0; j<N;j++) {
			for(int k=j+1; k<N; k++) {
				sum += LEN(xy[j][0],xy[j][1],xy[k][0], xy[k][1]);
			}
		}
		
		System.out.print(sum*2/N);
	}
	
	private static double LEN(int px, int py, int qx, int qy) {
	    return Math.sqrt((px-qx)*(px-qx) + (py-qy)*(py-qy));
	}
}
