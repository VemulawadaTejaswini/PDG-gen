import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		for(int i=0;i<n;i++){
			time[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			int a = time[i];
			int b = time[i+1];
			if(a>=b){
				time[i+1] = a*b/gcd(a,b);
			}
			else{
				time[i+1] = a*b/gcd(b,a);
			}
		}
		System.out.println(time[n-1]);
	}

	public static int gcd(int a,int b){
		if(a%b==0){
			return b;
		}
		else{
			return gcd(b,a/b);
		}
	}
}