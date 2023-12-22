import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	
	public static long left_to_right(char[] inputs, int start, int end){
		int ops_pos = end - 1;
		while(ops_pos >= start && ('0' <= inputs[ops_pos] && inputs[ops_pos] <= '9')){
			ops_pos--;
		}
		
		long fst_number = 0;
		for(int pos = end - 1, keta = 1; pos > ops_pos; pos--, keta *= 10){
			fst_number += keta * (inputs[pos] - '0');
		}
		
		//System.out.println(start + " " + ops_pos + " " + end + " " + (ops_pos < start ? "" : inputs[ops_pos]) + " " + fst_number);
		
		if(ops_pos < start){
			return fst_number;
		}else if(inputs[ops_pos] == '+'){
			return fst_number + left_to_right(inputs, start, ops_pos);
		}else{
			return fst_number * left_to_right(inputs, start, ops_pos);
		}
	}
	
	public static long multi(String input){
		String[] inputs = input.split("\\+");
		
		long ret = 0;
		for(String in : inputs){
			String[] multi = in.split("\\*");
			long ret_m = 1;
			for(String mul : multi){
				ret_m *= Long.parseLong(mul);
			}
			
			ret += ret_m;
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		final long answer = sc.nextInt();
		
		final long left  = left_to_right(input.toCharArray(), 0, input.length());
		final long multi = multi(input);
		
		//System.out.println(left + " " + multi);
		
		if(left == answer && multi == answer){
			System.out.println("U");
		}else if(left == answer){
			System.out.println("L");
		}else if(multi == answer){
			System.out.println("M");
		}else{
			System.out.println("I");
		}
		
		sc.close();
	}

	public static class Scanner {
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

		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() throws IOException {
			br.close();
		}
	}
}