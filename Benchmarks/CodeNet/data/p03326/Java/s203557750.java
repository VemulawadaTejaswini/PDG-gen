import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long x[]=new long[n];
		long y[]=new long[n];
		long z[]=new long[n];
		long y2[]=new long[n];
		long z2[]=new long[n];
		long p1[]=new long[n];
		long p2[]=new long[n];
		long p3[]=new long[n];
		long p4[]=new long[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
			z[i]=sc.nextLong();
			y2[i]=-y[i];
			z2[i]=-z[i];
			p1[i]=x[i]+y[i]+z[i];
			p2[i]=x[i]+y2[i]+z[i];
			p3[i]=x[i]+y[i]+z2[i];
			p4[i]=x[i]+y2[i]+z2[i];
			
		}
		
		Arrays.sort(p1);
		Arrays.sort(p2);
		Arrays.sort(p3);
		Arrays.sort(p4);
		
		long sum[]=new long[8];
		for(int i=0;i<m;i++) {
			sum[0]+=p1[i];
			sum[1]+=p1[n-1-i];
			sum[2]+=p2[i];
			sum[3]+=p2[n-1-i];
			sum[4]+=p3[i];
			sum[5]+=p3[n-1-i];
			sum[6]+=p4[i];
			sum[7]+=p4[n-1-i];
		}
		for(int i=0;i<8;i++) {
			sum[i]=Math.abs(sum[i]);
		}
		Arrays.sort(sum);
		System.out.println(sum[7]);
	}
	
}



