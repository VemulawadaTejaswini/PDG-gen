import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long d = sc.nextInt();
		long[] x=new long[n];
		long[] y=new long[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if(d*d>=(x[i]*x[i]+y[i]*y[i])){
				ans++;
			}
		}
		System.out.println(""+ans);

	}

}