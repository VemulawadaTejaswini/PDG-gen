import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		    long a[] = new long[n];
		    long sum = 0;
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextLong();
		        sum += a[i];
		    }
		    long ans = 0;
		    for(int i=0;i<n;i++){
		        sum -= a[i];
		        ans += sum*a[i];
		        ans %= 1000000007;
		    }
		    System.out.println(ans);    
		    
	}
}
