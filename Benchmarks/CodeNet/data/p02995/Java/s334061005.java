import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt(), B = teclado.nextInt(), C = teclado.nextInt(), D = teclado.nextInt(), e=0;
		for(int i=A;i<B;i++) {
			if(i%C != 0 && i%D != 0) {
				e++;
				
			}
		}
		System.out.println(e);

	}

}
