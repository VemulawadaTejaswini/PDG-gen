import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = "Three";
		for(int i = 0;i < N;i++) {
			String S = sc.next();
			if(S == "Y") {
				A = "Four";
				break;
			}
		}
		System.out.println(A);
	}

}