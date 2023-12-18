import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String ans = "YES";
		String A = reader.next();
		String B = reader.next();
		String C = reader.next();
		char a1 = A.charAt(A.length()-1);
		char b1 = B.charAt(0);
		char b2 = B.charAt(B.length()-1);
		char c1 = C.charAt(0);
		if (a1 != b1 || b2 != c1) {
			ans = "NO";
		}



		System.out.println(ans);
		reader.close();

	}

}
