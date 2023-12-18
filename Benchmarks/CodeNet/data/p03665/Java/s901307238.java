import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int even = 0;
		int odd = 0;
		for(int i=0; i<N; i++) {
			if(sc.nextInt()%2==0)
				even++;
			else
				odd++;
		}
		long ans = 1;
		ans <<=  even;
		if(odd==0) {
			if(P==1)
				ans = 0;
		} else {
			ans <<= odd-1;
		}
		System.out.println(ans);

		sc.close();
	}
}
