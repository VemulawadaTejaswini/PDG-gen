import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double k = sc.nextDouble();
		
		double E = 0;
		double q;
		for(double p = 1; p <= n; p++) {
			double Ep = 1/n;
			q = p;
			if(p >= k) {
				E += Ep;
			}
			if(p < k) {
				do{
					q = q * 2;
					Ep = Ep / 2;
				}while(q < k);
				
				E += Ep;
			}
		}
		System.out.println(E);

	}

}
