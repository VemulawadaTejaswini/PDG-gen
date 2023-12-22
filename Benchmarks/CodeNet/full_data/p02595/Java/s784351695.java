import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int ct=0;
		int c=d^2;
		for(int j=0;j<n;j++) {
		
		if(c>=x[j]*x[j]+y[j]*y[j]) {
			ct++;
		}
		System.out.println(ct);
		sc.close();
		}
	}
}
