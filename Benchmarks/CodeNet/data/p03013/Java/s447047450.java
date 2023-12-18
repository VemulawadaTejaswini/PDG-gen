import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] =  new int[m];
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
		}
		long ans = 1;
		int tmp = 0;
		for(int i = 0; i < m; i++){
			ans = ans*Main.in(a[i]-1-tmp);
			tmp = a[i]+1;
		}
		ans = (ans*Main.in(n-tmp))%1000000007;
		System.out.println(Math.max(0,ans));
	}

	static int in(int n){
		if(n == 0){
			return 1;
		}else if(n <= 2){
			return n;
		}else{
			return in(n-1)+in(n-2);
		}
	}
}
