

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, k;
		n = teclado.nextInt();
		k = teclado.nextInt();
		int cont =0;
		int a;
		if(k <= n && n <=50 && 1 <= k ) {
			for(int i=k-1; i <n ;i ++) {
				a=i+i+1;
				cont++;
			
			}
		}
		System.out.println(cont);

	}

}