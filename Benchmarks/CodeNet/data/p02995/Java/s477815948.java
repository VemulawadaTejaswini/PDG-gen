import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long A = teclado.nextLong(), B = teclado.nextLong(), C = teclado.nextLong(), D = teclado.nextLong(), e=0;
		for(long i=A;i<B;i++) {
			if(i%C != 0 && i%D != 0) {
				e++;
				
			}
		}
		System.out.println(e);
		teclado.close();

	}

}
