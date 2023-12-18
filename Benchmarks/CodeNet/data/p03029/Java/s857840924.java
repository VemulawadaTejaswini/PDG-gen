import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, p;
		a=teclado.nextInt();
		p=teclado.nextInt();
		if(a >=0 && p >= 0 && a <=100 && p <= 100) {
			
				System.out.println(((a*3)+p)/2);
			}
		
		}
	}