import java.util.*;


public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int mul = a * b;
	
	if ( mul % 2 == 0 ) {
	    System.out.println("Even");
	} else {
	    System.out.println("Odd");
	}
    }
    
}