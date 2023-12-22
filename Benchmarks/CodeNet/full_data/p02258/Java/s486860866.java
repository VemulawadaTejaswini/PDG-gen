import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int m = sc.nextInt();
		int[] R = new int[m];
		
		for(int i=0;i<m;i++) R[i] = sc.nextInt();
		
		int mn = R[0];
		int ret = -1000000001;
		for(int i=1;i<m;i++){
			ret = Math.max(ret, R[i]-mn);
			mn = Math.min(mn, R[i]);
		}
		cout(ret);
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