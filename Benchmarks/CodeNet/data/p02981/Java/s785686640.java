import java.util.Scanner;
import java.io.IOException;
	public class Main {
		
	    public static void main(String[] args) throws IOException {
	    	Scanner teclado = new Scanner(System.in);
	    	int a = teclado.nextInt();
	    	int b = teclado.nextInt();
	    	int c = teclado.nextInt();
	    	if(a*b<c) {
	    		System.out.println(a*b);
	    	}else {
	    		System.out.println(c);
	    	}
	    }
	
	}