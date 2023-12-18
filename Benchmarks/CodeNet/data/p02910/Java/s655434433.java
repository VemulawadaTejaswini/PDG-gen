import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.substring(i, i+1).equals("R")  || S.substring(i, i+1).equals("U") || S.substring(i, i+1).equals("D")) {
					count++;
				}
			}
			if(i % 2 == 1) {
				if(S.substring(i, i+1).equals("L")  || S.substring(i, i+1).equals("U") || S.substring(i, i+1).equals("D")) {
					count++;
				}
			}
		}
		if(count == S.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
