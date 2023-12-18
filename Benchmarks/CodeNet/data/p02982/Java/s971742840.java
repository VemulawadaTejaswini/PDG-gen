
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		List lst=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),D=sc.nextInt();
		double[][] X=new double[D][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				X[j][i]=sc.nextDouble();
			}
			
		}
		double result;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				result=0;
				for(int k=0;k<D;k++) {
					result+=Math.pow(X[k][i]-X[k][j],2.0);
									}
				result=Math.sqrt(result);
				lst.add(result);
				
				
			}
			
		}
		int count=0;
		for(int i=0;i<lst.size();i++) {
			double temp=(double)lst.get(i)-((Double)lst.get(i)).intValue();
			if(temp==0.0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
	
		
		
}
}
