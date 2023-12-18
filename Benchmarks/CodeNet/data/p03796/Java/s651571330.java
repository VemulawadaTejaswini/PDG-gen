//package reedeka;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n;
		n = sc.nextLong();
		long i;
		long c = 1000000007;
		long ans = 1;
		for(i=1; i<=n; i++) {
			ans = ((ans%c)*(i%c))%c;
		}
		System.out.println(ans);
	}
}
