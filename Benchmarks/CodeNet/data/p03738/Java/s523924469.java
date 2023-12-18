import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if(A.compareTo(B) == 0) System.out.println("EQUAL");
		else if(A.compareTo(B) > 0) System.out.println("GREATER");
		else if(A.compareTo(B) < 0) System.out.println("LESS");
	}

}