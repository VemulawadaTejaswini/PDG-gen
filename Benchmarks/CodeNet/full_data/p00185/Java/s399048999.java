import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	static boolean[] prime = new boolean[1000001];

	public static void main(String[] args) {
		ersis();
		while(true){
			int n = si();
			if(n==0) break;

			int cnt = 0;
			for (int i = 2; i <= n/2 ; i++) {
				if(!prime[i] && !prime[n-i]) cnt++;
			}
			out.println(cnt);
		}
		out.flush();
	}

	static void ersis(){
		prime[0] = prime[1] = true;
		for (int i = 0; i*i<1000000 ; i++) {
			if(!prime[i])
				for (int j = i*2; j <= 1000000 ; j+=i) {
					prime[j] = true;
				}
		}
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}