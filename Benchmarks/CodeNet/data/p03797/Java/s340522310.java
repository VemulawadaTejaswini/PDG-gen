import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long ans = 0;
		if(n>=m*2) {
			ans = m/2;
		}else {
			long x = (m-2*n)/4;
			ans = n+x;
		}
		System.out.println(ans);
		sc.close();
	}


}
