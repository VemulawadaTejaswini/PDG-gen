import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if(S.length() > 9) {
			System.out.println("NO");
			System.exit(0);
		}
		String[] w = {"KIH", "B", "R"};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					for(int l = 0; l < 2; l++) {
						String s = "";
						if(i == 1) s += "A";
						s += w[0];
						if(j == 1) s += "A";
						s += w[1];
						if(k == 1) s += "A";
						s += w[2];
						if(l == 1) s += "A";
						if(S.equals(s)) {
							System.out.println("YES");
							System.exit(0);
						}
					}
				}
			}
		}
		System.out.println("NO");
	}
}