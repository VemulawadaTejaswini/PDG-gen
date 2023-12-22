import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
	//WRWWRWRR     wwwrrrrwwwwrrr
	///112 112
	///1223 12
	public void solve(int testNumber, InputReader in, PrintWriter out) {

	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		long n = Long.parseLong(scanner.nextLine());
		n--;
		long max = (long)1e18+1;
		List<Long> res = new ArrayList<>();
		long aka = 0;
		long[] arr = new long[20];
		arr[0] = 1;
		for(int i=1;i<20;i++){
			arr[i] = arr[i-1]*26;
		}
		long sum = 0;
		for(int i=1;i<20;i++){
			sum+=arr[i];
			if(n<sum){
				int len = i;
				StringBuilder sb = new StringBuilder();
				n-=(sum-arr[i]);
				for(int j=0;j<len;j++){
					int idx = (int) (n/arr[len-j-1]);
					//System.out.println(n+" "+arr[len-j-1]);
					sb.append((char)(idx+'a'));
					n-=arr[len-j-1]*idx;
				}
				System.out.println(sb.toString());
				return ;
			}
		}
	}
//	public static void main(String[] args){
//        InputStream inputStream = System.in;
//        OutputStream outputStream = System.out;
//        InputReader in = new InputReader(inputStream);
//        PrintWriter out = new PrintWriter(outputStream);
//        Main solver = new Main();
////        int num = in.nextInt();
////        while(num-->0){
////            solver.solve(1, in, out);
////        }
//        solver.solve(1, in, out);
//        out.close();
//    }
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
