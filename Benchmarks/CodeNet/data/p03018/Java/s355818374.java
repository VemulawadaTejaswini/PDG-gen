import java.io.IOException;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) throws IOException {
			Scanner teclado = new Scanner(System.in);
			String a = teclado.next();
			String[] x = new String[a.length()+1];
			for(int i = 0;i<a.length();i++) {
				x[i] = a.substring(i, i+1);
			}
			boolean trocou = false;
			int orozco = 0;
			while(true) {
				for(int i = 0;i<a.length()-2;i++) {
					if(x[i].equals("A") && x[i+1].equals("B") &&x[i+2].equals("C") ) {
						x[i] = "B";
						x[i+1] = "C";
						x[i+2] = "A";
						trocou = true;
						orozco++;
					}
				}
				if(trocou == false) {
					break;
				}
				trocou = false;
			}
			System.out.println(orozco);
	}
}