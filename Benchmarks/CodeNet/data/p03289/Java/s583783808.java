import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S =in.next();
		boolean flag=S.matches("A[a-z]C[a-z][a-z]*");
		
		
		if(flag) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}

	}
}
