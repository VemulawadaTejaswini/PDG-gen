import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long ans=1;
		for(int i=2;i<=N;++i){
			if(i%2==1 && isPrime(i)){
				ans += i*2;
				continue;
			}
			ans += i*f(i);
		}
		System.out.println(ans);
	}

	public static long f(int x){
		int num = x;
		long ans = 1;
		int[] ind = new int[x + 1];
		for(int i=2;i<=x;++i){
			while(num%i==0){
					ind[i]++;
					num /= i;
			}
		}
		for(int i=2;i<=x;++i){
			ans *= ind[i]+1;
		}
		return ans;
	}
	/*
	public static int f(int x){
		ArrayList ans = new ArrayList();

		for(int i=2;i*i<=x;++i){
			int count = 0;
			while(x%i==0){
				count++;
				x/=i;
			}
			ans.add();
		}
	}*/
	public static boolean isPrime(int x){
		if (x == 1)
			return false;
		for (int i = 2; i * i <= x; ++i) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
