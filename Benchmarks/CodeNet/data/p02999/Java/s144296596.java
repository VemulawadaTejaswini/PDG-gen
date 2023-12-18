import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double X=teclado.nextDouble(),A=teclado.nextDouble();
		if(X<A) {
			System.out.println("0");
		}else {
			System.out.println("10");
		}

	}

}