import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int l = X.length();
		for(int i = 0; i < 50; i++) {
			X = X.replaceAll("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "");
		}
		int idx = 0;
		while(true) {
			X = X.replaceAll("ST", "");
			idx++;
			if(X.length() == l) {
				break;
			}else {
				l = X.length();
			}
			if(idx > 100000) break;
		}
		System.out.println(X.length());
	}
}