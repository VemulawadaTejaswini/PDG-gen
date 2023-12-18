import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Long A = teclado.nextLong();
		Long B = teclado.nextLong();
		Long C = teclado.nextLong();
		Long D = teclado.nextLong();
		int quant = 0;
		for (Long x = A; x <= B; x++) {
			if (x % C != 0 && x % D != 0) {
				quant = quant + 1;
			}
		}
		
		System.out.println(quant);
		
		teclado.close();

	}

}
