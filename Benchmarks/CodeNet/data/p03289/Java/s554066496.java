import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean ans = true;
		char c[] = a.toCharArray();
		int n = a.length();
		if (c[0] != 'A') {
			ans = false;
		}
		int cc = 0;
		for (int i = 2; i <= n - 2; i++) {
			if (c[i] == 'C') {
				cc++;
			}

		}

		if (cc != 1) {
			ans = false;
		}

		for (int i = 0; i <= n - 1; i++) {
			if (c[i] == 'B' || c[i] == 'D' || c[i] == 'E' || c[i] == 'F'
					|| c[i] == 'G' || c[i] == 'H' || c[i] == 'I' || c[i] == 'J'
					|| c[i] == 'K' || c[i] == 'L' || c[i] == 'N' || c[i] == 'M'
					|| c[i] == 'O' || c[i] == 'P' || c[i] == 'Q' || c[i] == 'R'
					|| c[i] == 'S' || c[i] == 'T' || c[i] == 'U' || c[i] == 'V'
					|| c[i] == 'W' || c[i] == 'X' || c[i] == 'Y' || c[i] == 'Z') {
				ans = false;
			}

		}
		if(ans){
			System.out.println("AC");
		}else{System.out.println("WA");}

	}
}