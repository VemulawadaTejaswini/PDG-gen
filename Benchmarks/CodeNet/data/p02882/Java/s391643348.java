import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int x = stdIn.nextInt();
		
		
		if(a*a*b <= 2*x) {
			double h = 2*(a*b-(double)x/a)/(double)a;
			double kakudo =Math.toDegrees(Math.atan2(h, a));
			System.out.println(kakudo);
		}else {
			double h = 2 * x/((double)a*b);
			double kakudo = Math.toDegrees(Math.atan2(b, h));
			System.out.println(kakudo);
			
		}
		
		
		
	}

}
