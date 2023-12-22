import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] s = new String[n];
		int count = 0;

		for(int i = 0;i < n;i++) {
			s[i] = scan.next();

			if(i == 1) {
				if(s[1].equals(s[0])) {
					s[1] = "0";
				}
			}else if(i > 1) {
				for(int j = 0;j < i;j++) {
					if(s[i].equals(s[j])) {
						s[i] = "0";
					}
				}
			}
		}

		for(int i = 0;i < n;i++) {
			if(s[i].equals("0")) {

			}else {
				count += 1;
			}
		}
		System.out.println(count);
	}
}