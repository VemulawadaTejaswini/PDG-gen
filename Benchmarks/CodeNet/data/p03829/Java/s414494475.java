import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] x=new long[n];
		long ans=0;
		for(int i = 0; i<n; i++){
			x[i]=sc.nextLong();
		}
		for(int i = 0; i<n-1; i++){
			ans+=Math.min(b,(x[i+1]-x[i])*a);
		}
		System.out.println(ans);
	}
}