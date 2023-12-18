import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S =in.next();
		boolean flag=true;
		flag=S.matches("A[a-z]{1}C[a-z].*");
		
		
		if(flag) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}

	}
}