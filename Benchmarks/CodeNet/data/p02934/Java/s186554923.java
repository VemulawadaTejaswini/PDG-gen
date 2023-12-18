import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int num = lcm(a,n);
		//System.out.println(l);
		int deno = sum(a,n,num);
		System.out.println(deno);
		double ans = num / (double)deno;
		System.out.println(ans);
	
	}
	
	public static int gcd(int a, int b){
		if(a == 0){
			return b;
		}
		if(b == 0){
			return a;
		}
		if(a > b){
			return gcd(a-b,b);
		}
		return gcd(a,b-a);
	}
	
	public static int lcm(int[] a, int n){
		int lc = 1;
		for(int i = 0; i < n; i++){
			if(lc % a[i] == 0)
				i += 1;
			lc =  (lc * a[i])/gcd(lc,a[i]);
		}
		return lc;
	}
	
	public static int sum(int[] a,int n,int num){
		int count = 0;
		for(int i = 0; i < n; i++){
			count += (num/a[i]);
		}
		return count;
	}
	
	
	
	}