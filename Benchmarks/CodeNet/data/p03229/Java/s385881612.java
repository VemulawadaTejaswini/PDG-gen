import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		if(n==2){
			System.out.println(a[1] - a[0]);
		}
		else if(n==3){
			System.out.println(Math.max(a[2]*2-a[0]-a[1], a[1]+a[2]-a[0]*2));
		}
		else if(n%2==1){		
			long sum1 = 0L;
			long sum2 = 0L;
			for(int i=0; i<=(n-3)/2; i++){
				sum1 = sum1 - 2*a[i] + 2*a[i+(n+1)/2];
				sum2 = sum2 - 2*a[i] + 2*a[i+(n-1)/2];
			}
			sum1 = sum1 - a[(n-1)/2] + a[(n-3)/2];
			sum2 = sum2 + a[n-1] - a[(n-1)/2] - a[(n+1)/2];
			System.out.println(Math.max(sum1, sum2));
		}
		else{
			long sum = 0;
			for(int i=0; i<=n/2-1; i++){
				sum = sum - 2*a[i] + 2*a[i+n/2];
			}
			sum = sum + a[n/2-1] - a[n/2];
			System.out.println(sum);
		}
	}
}