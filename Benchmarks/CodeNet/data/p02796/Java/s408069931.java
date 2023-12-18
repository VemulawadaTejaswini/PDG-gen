import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] x=new double[n];
		double[] l=new double[n];
		double[] max=new double[n];
		double[] min=new double[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextDouble();
			l[i]=sc.nextDouble();
			max[i]=x[i]+l[i];
			min[i]=x[i]-l[i];
		}
		Arrays.sort(max);
		Arrays.sort(min);
		long sum=0;
		long[] ss=new long[n];
		for(int i=0; i<n; i++){
			int ix=-Arrays.binarySearch(max,x[i]-l[i]+0.1)-1;
			int in=-Arrays.binarySearch(min,x[i]+l[i]-0.1)-1;
			ss[i]=n-ix-n+in-1;
			sum+=ss[i];
		}
		if(sum==0){
			System.out.println(n);
			return;
		}
		Arrays.sort(ss);
		for(int i=n-1; i>=0; i--){
			sum-=ss[i]*2;
			if(sum<0){
				ss[10000000]=0;
			}
			if(sum==0){
				System.out.println(i);
				return;
			}
		}
	}
}
