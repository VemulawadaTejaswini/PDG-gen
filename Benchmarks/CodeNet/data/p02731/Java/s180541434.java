import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt();
		double ans=0;

		for(double i=0;i<=L;i+=0.01) {
			for(double j=0;j<=L;j+=0.01) {
				double k=L-(i+j);
				double volume =i*j*k;
				if(ans<volume) {
					ans=volume;
				}
			}
		}
		System.out.println(ans);
	}
}