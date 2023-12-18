import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner teclado = new Scanner (System.in);
		int a;
		int b;
		a=teclado.nextInt();
		b=teclado.nextInt();
		
		
		if(((a*2)-1) > a+b &&  (((a*2)-1)) > ((b*2)-1) ){
			System.out.println((a*2)-1);
		}else if(((b*2)-1) > a+b && ((b*2)-1) >((a*2)-1) ) {
			System.out.println((b*2)-1);			
		}else {
			System.out.println(a+b);
		}
	}
	
}
