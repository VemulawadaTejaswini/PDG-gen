import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p;
        if(a > b) {
        	p = a;
        	a = b;
        	b = p;
        	}
        if(b > c) {
        	p = b;
        	b = c;
        	c = p;
        	}
        if(a > c) {
        	p = a;
        	a = c;
        	c = p;
        	}
        System.out.println( a + "  " + b + "  " + c );
	}

}
