import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int l = X.length();
		for(int i = 0; i < 50; i++) {
			X = X.replaceAll("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "");
		}
		while(true) {
			X = X.replaceAll("ST", "");
			if(X.length() == l) {
				break;
			}else {
				l = X.length();
			}
		}
		System.out.println(X.length());
	}
}