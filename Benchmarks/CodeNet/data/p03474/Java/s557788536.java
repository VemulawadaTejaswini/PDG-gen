import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		boolean b = true;

		String[] SA = S.split("-");
		if(!(SA.length == 2)) b = false;
		if ((S.charAt(A) == '-') && (A == SA[0].length()) && (B == SA[1].length())) {
			for (int i = 0; i < A; i++) {
				if ((S.charAt(i) < 0) && (S.charAt(i) > 10)) {
                    b = false;
				}
			}
			for (int j = A + 1; j < A + B + 1; j++) {
				if ((S.charAt(j) < 0) && (S.charAt(j) > 10)) {
					b = false;
				}
			}
		} else {
			b = false;
		}



		if(b == true) {
			System.out.println("Yes");
		} else if(b == false){
			System.out.println("No");
		}

	}

}
