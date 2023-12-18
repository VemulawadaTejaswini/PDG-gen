import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long P = sc.nextLong();

		long ans = 1;
		long div = 2;
		while(div*div<=P) {
			if(P%div==0) {
				int cnt=0;
				while(P%div==0) {
					cnt++;
					P/=div;
				}
				for(int i=0; i<cnt/N; i++) 
					ans *= div;
			}
			div++;
		}
		if(N==1)
			ans *= P;
		
		System.out.println(ans);
		sc.close();
	}
}
