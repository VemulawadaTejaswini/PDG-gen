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
		int ans = 1;
		for(int i=1;i*i<=x;++i){
			if(x%i==0){
				ans++;
				if(i*i!=x) ans++;
			}
		}
		return ans;
	}
	/*
	public static int f(int x){
		int[][] ans = new int[10000][10000];

		for(int i=2;i*i<=x;++i){
			int count = 0;
			while(x%i==0){
				count++;
				x/=i;
			}
			ans[i][count] = 1;
		}
		if(x!=1){
			ans[x][1] = 1;
		}
		int count=0;
		for(int i=0;i<10000;++i){
			for(int j = 0;j<10000;++j){
				if(ans[i][j]==1) count++;
			}
		}
		return count;
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
