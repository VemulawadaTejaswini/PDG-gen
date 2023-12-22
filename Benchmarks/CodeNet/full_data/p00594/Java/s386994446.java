import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[1000001];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			System.gc();
			//int[] array = new int[N];
			
			
			Arrays.fill(array, -1);
			for(int i = 0; i < N; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int count = 1;
			boolean flag = false;;
			int offset = 1000001 - N;
			int prev = array[0 + offset];
			for(int i = 1 + offset; i < N + offset; i++){
				if(prev == array[i]){
					count++;
				}else{
					if(count > N / 2){
						System.out.println(prev);
						flag = true;
						break;
					}
					
					prev = array[i];
					count = 1;
				}
			}
			
			if(count > N / 2){
				System.out.println(prev);
				flag = true;
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
			
		}

	}
	
	public static class Scanner {
		
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException{
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}
		
		private void getLine() throws IOException{
			while(tok == null || !tok.hasMoreTokens()){
				tok = new StringTokenizer(br.readLine());
			}
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public String next() throws IOException{
			if(hasNext()){
				return tok.nextToken();
			}else{
				getLine();
				return tok.nextToken();
			}
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