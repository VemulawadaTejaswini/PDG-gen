import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum,SUM=0,s;
		double a,t;
		for(int i=1;i<=N;i++) {
			t=i;
			sum=0;
			sum+=i%10;
			t-=i%10;
			
			for(double k=4;k>0;k--) {
				a=t/Math.pow(10,k);
				if(a>=1) {
					sum+=a;
					t=t-a*Math.pow(10,k);
				}
				
			}
			if(sum>=A && sum<=B) SUM+=i;
		}
		System.out.println(SUM);
	}

}
