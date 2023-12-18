import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] command = br.readLine().split(" ");
		long N = Long.parseLong(command[0]);
		long K = Long.parseLong(command[1]);
		
		long a = N / K ;
		long b = N % K;
		

		
		
		if(a == 0) {
			if(Math.abs(N) > Math.abs(a - b)) {
				System.out.println(Math.abs(a - b));
			}else {
				System.out.println(Math.abs(N));
			}
		}else{
			long d = a * K;
			long c = N % d;
			if(Math.abs(c) > Math.abs(c - K)) {
				System.out.println(Math.abs(c - K));
			}else {
				System.out.println(Math.abs(c));
			}
		}
		
	}

}
