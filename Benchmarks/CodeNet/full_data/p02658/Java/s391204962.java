import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long limit = (long)(1e18);
		long ans = 1;
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			long x = input.nextLong();
			ans*=x;
			if (ans>limit) {
				ans=-1;
				break;
			}
		}
		System.out.println(ans);
	}	
}