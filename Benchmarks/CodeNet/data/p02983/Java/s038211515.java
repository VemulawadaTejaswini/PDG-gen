import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = teclado.nextInt();
		int r = teclado.nextInt();
		int menor = Integer.MAX_VALUE;
		for (int x = i; x <= r; x++){
			if (x != i) {
				int prod = i * x;
				int mod = prod % 2019;
				if (mod < menor) {
						menor = mod;
				}
			}
			
		}
		
		System.out.println(menor);
		
		teclado.close();
		
	}

}