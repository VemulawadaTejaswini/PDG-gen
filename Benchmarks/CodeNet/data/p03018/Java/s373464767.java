import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static int orozco = 0;
		public static void trocar(String[] vetor, int i) {
			if(vetor[i].equals("A") && vetor[i+1].equals("B") && vetor[i+2].equals("C")) {
				vetor[i] ="B";
				vetor[i+1] ="C";
				vetor[i+2] ="A";
				orozco++;
				for(int ii = -2;ii<=2;ii++) {
				trocar(vetor, i-ii);
						}
				}
			
		}
		public static void main(String[] args) throws IOException {
			Scanner teclado = new Scanner(System.in);
			String a = teclado.next();
			String[] x = new String[a.length()+15];
			x[0] = "0";
			x[1] = "0";
			x[2] = "0";
			x[a.length()+3] = "0";
			x[a.length()+4] = "0";
			x[a.length()+5] = "0";
			x[1] = "0";
			for(int i = 0;i<a.length();i++) {
				x[i+3] = a.substring(i, i+1);
			}
			for(int i = 2;i<a.length()+1;i++) {
				trocar(x, i);
			}
			System.out.println(orozco);
	}
}