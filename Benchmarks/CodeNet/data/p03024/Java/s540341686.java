import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
		Scanner teclado = new Scanner (System.in);
		int k = teclado.nextInt();
		String s[] = new String [k];
		int cont=0;
		for(int i=0 ; i<k ; i++) {
			s[i] = teclado.next();
			if(s[i].equals('x'));
			
			cont++;
		}
		if(cont < 8) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}

}
