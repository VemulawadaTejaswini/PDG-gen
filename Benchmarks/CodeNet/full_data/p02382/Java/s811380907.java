import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i]=sc.nextInt();
		}
		double D1=0,D2=0,D3=0,D=0;
		for(int i=0;i<n;i++){
			int d=Math.abs(x[i]-y[i]);
			D1+=d;
			D2+=d*d;
			D3+=d*d*d;
			if(D<d){
				D=d;
			}
		}
		System.out.printf("%.6f\n", D1);
		System.out.printf("%.6f\n", Math.sqrt(D2));
		System.out.printf("%.6f\n", Math.cbrt(D3));
		System.out.printf("%.6f\n", D);
	}
}