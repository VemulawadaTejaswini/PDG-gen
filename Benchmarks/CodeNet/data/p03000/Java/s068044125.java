import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int x = teclado.nextInt();
		int quant = 0;
		int v[] = new int[n];
		int r[] = new int[n+1];
		for (int y = 0; y < n; y++) {
			v[y] = teclado.nextInt();
		}
		
		r[0] = 0;
		
		for (int y = 1; y <= n; y++) {
			int z = y - 1;
			r[y] = r[z] + v[z];
		}
		
		for (int y = 0; y <= n; y++) {
			if (r[y] <= x) {
				quant = quant + 1;
			}
		}
		
		System.out.println(quant);
		
		teclado.close();
		
	}
}