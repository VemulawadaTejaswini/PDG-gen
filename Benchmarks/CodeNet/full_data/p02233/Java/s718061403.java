import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		long[] fib = {1,1,1};
		int ptr = 0;
		long ans = 0;
		for(int i=2; i<=n; i++, ptr=(ptr+1)%3) {
			ans = fib[ptr] = fib[(ptr+1)%3] + fib[(ptr+2)%3];  
		}
		out.println(ans);
		out.flush();
	}
}