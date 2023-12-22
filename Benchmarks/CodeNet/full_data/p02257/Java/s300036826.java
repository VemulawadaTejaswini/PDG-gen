import java.util.*;
 
public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		int n = sc.nextInt();
		int[] in = new int[n];
		for(int i=0;i<n;i++) in[i] = sc.nextInt();
		for(int t=0;t<n;t++){
			int num = in[t];
			if(num==1) continue;
			boolean f = true;
			for(int i=2;i*i<=num;i++){
				if(num%i==0){
					f = false;
					break;
				}
			}
			
			if(f) ans++;
		}
		cout(ans);
	}
	
	public static boolean isPrime(int n){
		for(int i=2;i<=n*n;i++){
			if(n%i==0) return true;
		}
		return false;
	}
	
	public static int gcd(int a,int b){
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	
	public static void showary(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.print(ary[i]+" ");
		}
		cout(ary[ary.length-1]);
	}
	
	public static void cout(String n){
		System.out.println(n);
	}
	
	public static void cout(int n){
		System.out.println(n);
	}
	public static void cout(boolean n){
		if(n==true){
			cout("true");
		}else{
			cout("false");
		}
	}
}