import java.util.Arrays;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solver solver = new Solver();
		solver.solve(1, in, out);
		out.close();
	}
}



class InputReader {
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


class Solver{
	public void solve(int testNumber, InputReader in, PrintWriter out){
		int N = in.nextInt();
		int K = in.nextInt();
		int arr [] = new int [N];
		for(int i =0 ; i < N; i++){
			arr[i] = in.nextInt();
		}

		int dp [] = new int [N];
		Arrays.fill(dp,Integer.MAX_VALUE);

		dp[0] = 0;

		for(int i = 1; i < N; i++){
				for(int j=1; j <= K && j <= i; j++ ){
					dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(arr[i] - arr[i-j]));
				}
		} 


		out.println(dp[N-1]);

	}
}