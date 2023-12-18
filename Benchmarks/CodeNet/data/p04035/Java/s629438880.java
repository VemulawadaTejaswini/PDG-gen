import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final long L = sc.nextLong();
		
		long[] arr = new long[N];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextLong();
		}
		
		for(int i = 0; i < N; i++){
			boolean flg = false;
			if(i != 0 && arr[i - 1] + arr[i] >= L){
				flg = true;
			}
			if(i != N - 1 && arr[i] + arr[i + 1] >= L){
				flg = true;
			}
			
			if(!flg){
				System.out.println("Impossible");
				return;
			}
		}
		
		long[] l_sum = new long[N];
		for(int i = 0; i < N; i++){
			l_sum[i] = arr[i] + (i != 0 ? l_sum[i - 1] : 0);
		}
		
		int left_index = 0;
		int right_index = N - 1;
		
		LinkedList<Integer> answer = new LinkedList<Integer>();
		while(left_index < right_index){
			final long left_sum = left_index == 0 ? 0 : l_sum[left_index - 1];
			final long right_sum = l_sum[right_index];
			final long range_sum = right_sum - left_sum;
			//System.out.println(left_index + ", " + right_index + " : " + range_sum);
			
			if(range_sum < L){ break; }
			
			if(arr[left_index] < arr[right_index]){
				answer.add(left_index + 1);
				left_index++;
			}else{
				answer.add(right_index);
				right_index--;
			}
		}
		
		
		if(answer.size() >= N - 1){
			System.out.println("Possible");
			for(final int ans : answer){
				System.out.println(ans);
			}
		}else{
			System.out.println("Impossible");
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

		public void close() throws IOException {
			br.close();
		}
	}
}