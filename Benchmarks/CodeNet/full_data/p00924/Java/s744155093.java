import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		final int N_bits = 1 << N;
		
		int[] visited = new int[N_bits];
		Arrays.fill(visited, -1);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int init = 0;
		for(int i = 0; i < N; i++){
			init *= 2;
			init += sc.nextInt();
		}
		
		int[] arr = new int[M];
		for(int i = 0; i < M; i++){
			arr[i] = sc.nextInt();
		}
		
		visited[init] = 0;
		queue.add(init);
		
		
		while(!queue.isEmpty()){
			final int bit = queue.poll();
			boolean flag = true;
			//System.out.println(bit);
			
			
			int prev = ((bit) >> (N - 1)) != 0 ? 1 : 0;
			//System.out.println(prev);
			
			int run = 0;
			int cnt = 1;
			for(int pos = N - 2; pos >= 0; pos--){
				//System.out.println(pos + " " + Integer.toBinaryString((1 << (pos + 1)) - 1) + " "  + Integer.toBinaryString(bit));
				final int cur = ((bit & ((1 << (pos + 1)) - 1)) >> pos) != 0 ? 1 : 0;
				//System.out.println("but" + " " + pos + " > " + cur + " " + prev + " " + cnt + " " + run);
				if(prev == cur){
					cnt++;
				}else{
					if(arr[run] == cnt){
						run++;
						cnt = 1;
						prev = cur;
					}else{
						flag = false;
						break;
					}
				}
			}
			
			if(arr[run] != cnt){
				flag = false;
			}else{
				run++;
			}
			
			if(flag){
				System.out.println(visited[bit]);
				break;
			}
			
			for(int fst = 0; fst < N - 1; fst++){
				//for(int snd = fst + 1; snd < N; snd++){
				final int snd = fst + 1;
					final int fst_value = (bit & (1 << fst)) != 0 ? 1 : 0;
					final int snd_value = (bit & (1 << snd)) != 0 ? 1 : 0;
					
					final int next_bit = (bit & ~(1 << fst) & ~(1 << snd)) | (snd_value << fst) | (fst_value << snd);
					
					//System.out.println(next_bit);
					
					if(visited[next_bit] >= 0){
						continue;
					}
					visited[next_bit] = visited[bit] + 1;
					
					queue.add(next_bit);
				//}
			}
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

		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() throws IOException {
			br.close();
		}
	}
}