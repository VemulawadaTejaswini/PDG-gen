import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if(n < 2){
			return 1;
		}else{
			int a = 1;
			int b = 1;
			int c = 0;
			for(int i = 2; i <= n; ++i) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}
}