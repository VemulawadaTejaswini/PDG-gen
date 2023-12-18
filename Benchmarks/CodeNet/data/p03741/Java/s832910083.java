import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int n = sc.nextInt();
			
			long[] array = new long[n];
			long sum = 0;
			
			for(int i = 0; i < n; i++){
				array[i] = sc.nextLong();
			}
			
			long answer = 0;
			
			sum += array[0];
			if(sum == 0){
				answer++;
				
				if(array[1] < 0){
					sum++;
				}else{
					sum--;
				}
			}
			
			for(int i = 1; i < n; i++){
				final long next = (Long.signum(sum) * -1) * (Math.abs(sum) + 1);
				//System.out.println(next + " " + sum + " " + array[i]);
				
				if(sum < 0 && next < array[i]){
					sum = sum + array[i];
				}else if(sum > 0 && next > array[i]){
					sum = sum + array[i];
				}else{
					final long diff = Math.abs(next - array[i]);
					
					answer += diff;
					sum += next;
				}
			}
			
			System.out.println(answer);
		}
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
		
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}