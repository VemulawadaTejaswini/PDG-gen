import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] divisors=new long[n+1];
		for(int i=1; i<=n; i++){
			int mul=1;
			while(mul*i<=n){
				divisors[mul*i]++;
				mul++;
			}
		}
		long ans=0;
		for(int i=1; i<=n; i++){
			ans+=i*divisors[i];
		}
		System.out.println(ans);
	}
}
