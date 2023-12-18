import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		
		long ans = 1;
		while(H>1) {
			H>>=1;
			ans= ans*2+1;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
