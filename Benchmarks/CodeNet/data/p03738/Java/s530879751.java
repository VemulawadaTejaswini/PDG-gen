
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		if (A.length()>B.length()) {
			System.out.println("GREATER");
		} else if(A.length()==B.length()){
			for (int i = 0; i < A.length(); i++) {
				char a = A.charAt(i);
				char b = B.charAt(i);
				if (a > b) {
					System.out.println("GREATER");
					break;
				}else if(a < b) {
					System.out.println("LESS");
					break;
				}
				if (i== A.length()-1) {
					System.out.println("EQUAL");
				}
			}

		}else if(A.length()<B.length()){
			System.out.println("LESS");
		}




	}


}

