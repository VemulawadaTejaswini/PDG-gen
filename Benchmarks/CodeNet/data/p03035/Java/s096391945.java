import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
		Scanner teclado = new Scanner (System.in);
		int a;
		int b;
		a=teclado.nextInt();
		b=teclado.nextInt();
		
		if(a >=0 && a <=100 && b%2==0 && b >=2 && b <=1000) {
			if(a >= 13 ) {
				System.out.println(b);
			}else {
				System.out.println(b/2);
			}
		}
		
		
	}
}


