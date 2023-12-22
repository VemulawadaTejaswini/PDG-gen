import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		long onijo = a + v * t;
		long onika = a  - v* t ;
		long chiljo = b + w *t;
		long chilka = b - w *t;

		
		if(a<b) {
			if(chiljo<=onijo) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			if(onika<=chilka) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

}