import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		
		long N = in.nextLong();
		long M = in.nextLong();
		long MOD = 1000000007;
		long ans = 0;
		
		if(N - M == 0){
			ans = factorial(N, MOD);
			ans = (ans * ans * 2) % MOD;
		}else if(Math.abs(N - M) == 1){
			ans = (factorial(N, MOD) * factorial(M, MOD)) % MOD;
		}
		
		System.out.println(ans);
	}
	
	public static long factorial(long n, long MOD){
		long ans = 1;
		for(long i = n; i >= 2; i--){
			ans *= i;
			ans %= MOD;
		}
		return ans;
	}
}
