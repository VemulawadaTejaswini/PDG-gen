import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String T = input.next();
		int A = input.nextInt();
		int B = input.nextInt();
		String U = input.next();
		
		if(U.equals(S)) {
			System.out.println((A-1)+" "+B);
		}
		else {
			System.out.println(A+" "+(B-1));
		}
	}
}
