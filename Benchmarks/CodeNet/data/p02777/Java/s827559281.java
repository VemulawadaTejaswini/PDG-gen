import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		String U = sc.next();
		sc.close();
		
		if(U.equals(S)) {
			A--;
			System.out.println(A + " " + B);
		}else if(U.equals(T)) {
			B--;
			System.out.println(A + " " + B);
		}

	}

}