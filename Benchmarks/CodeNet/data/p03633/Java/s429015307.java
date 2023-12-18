import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] time = new long[n];
		for(int i=0;i<n;i++){
			time[i] = sc.nextLong();
		}
		for(int i=0;i<n-1;i++){
			long a = time[i];
			long b = time[i+1];
			if(a>=b){
				time[i+1] = a/gcd(a,b)*b;
			}
			else{
				time[i+1] = a/gcd(b,a)*b;
			}
		}
		System.out.println(time[n-1]);
	}

	public static long gcd(long a,long b){
		if(a%b==0){
			return b;
		}
		else{
			return gcd(b,a%b);
		}
	}
}