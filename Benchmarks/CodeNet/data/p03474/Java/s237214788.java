import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		boolean b = true;
		/*
		int A2 = Integer.parseInt(S.substring(0, A));
		int B2 = Integer.parseInt(S.substring(A+2, A+B+1));
		*/


		if (S.charAt(A + 1) == '-') {
			for (int i = 0; i < A; i++) {
				if (!(S.charAt(i) > 0) && !(S.charAt(i) < 10)) {
					b = false;
				}
			}
			for (int j = A + 2; j < A + B + 1; j++) {
				if (!(S.charAt(j) > 0) && !(S.charAt(j) < 10)) {
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