import java.util.*;

public class Main {

	static public boolean judge(long num){
		if(num <= 1)return false;
		if(num == 2 || num == 3)return true;
		if(num % 2 == 0 || num % 3 == 0)return false;
		long n = (long)Math.sqrt((double)num);
		for(int i = 3; i <= n; i += 2){
			if(num % i == 0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		long ans = 1;
		long n = Math.min(a, b);
		for(long i = 2; i <= n; ++i){
			if(a % i == 0 && b % i == 0){
				if(judge(i))
				++ans;
			}
		}
		System.out.println(ans);
	}
}
