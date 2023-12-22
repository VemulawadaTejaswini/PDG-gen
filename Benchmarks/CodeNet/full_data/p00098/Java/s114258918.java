import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int[][] sum = new int[n + 2][n + 2];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 && j == 0){
					sum[i][j] = matrix[i][j];
				}else if(i == 0){
					sum[i][j] = sum[i][j-1] + matrix[i][j];
				}else if(j == 0){
					sum[i][j] = sum[i-1][j] + matrix[i][j];
				}else{
					sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int e_y = 0; e_y < n; e_y++){
			for(int e_x = 0; e_x < n; e_x++){
				
				for(int s_y = e_y - 1; s_y >= 0; s_y--){
					for(int s_x = e_x - 1; s_x >= 0; s_x--){
						max = Math.max(max, sum[e_y][e_x] - sum[s_y][e_x] - sum[e_y][s_x] + sum[s_y][s_x]);
					}
					
					max = Math.max(max, sum[e_y][e_x] - sum[s_y][e_x]);
				}
				
				for(int s_x = e_x - 1; s_x >= 0; s_x--){
					max = Math.max(max, sum[e_y][e_x] - sum[e_y][s_x]);
				}
				
				max = Math.max(max, sum[e_y][e_x]);
				
			}
		}
		
		System.out.println(max);
	}
	
	public static class Scanner {
		
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException{
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}
		
		private void getLine() throws IOException{
			tok = new StringTokenizer(br.readLine());
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public int nextInt() throws IOException{
			if(hasNext()){
				return Integer.parseInt(tok.nextToken());
			}else{
				getLine();
				return Integer.parseInt(tok.nextToken());
			}
		}
		
		public long nextLong() throws IOException{
			if(hasNext()){
				return Long.parseLong(tok.nextToken());
			}else{
				getLine();
				return Long.parseLong(tok.nextToken());
			}
		}
		
		public double nextDouble() throws IOException{
			if(hasNext()){
				return Double.parseDouble(tok.nextToken());
			}else{
				getLine();
				return Double.parseDouble(tok.nextToken());
			}
		}
	}
}