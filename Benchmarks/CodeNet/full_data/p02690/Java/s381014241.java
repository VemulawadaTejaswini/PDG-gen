import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = x;
		long a = 0, b = 0;
		long b_go = 0;
		int b_judge = 0;
		
		
		long cal= 1;
		long com = 0;
		long temp = 0;
		while(cal < 3) {
			if(Math.pow(Math.pow((double)x, 1.0/5.0),5.0) == Math.pow( (long)Math.pow((double)x, 1.0/5.0)  , 5.0)) {
				a = (long)Math.pow((double)x, 1.0/5.0);
				b_go = (long)Math.pow((double)a,5.0)-y;
				if(b_go<0) {
					b_go -= 2 * b_go;
					b_judge = -1;
				}
				if(Math.pow(Math.pow((double)b_go, 1.0/5.0),5.0) == Math.pow( (long)Math.pow((double)b_go, 1.0/5.0)  , 5.0)) {
					b = (long)Math.pow((double)b_go, 1.0/5.0);
					if(b_judge == -1) {
						b -= 2 * b;
					}
					break;
				}
				
			}
				
			if( com == 0) {
				x = y+ cal;
				com = 1;
			}else {
				x = y - cal;
				cal++;
				com--;
			}
		
		
		}
		System.out.println(a + " " + b);
		
	}
}