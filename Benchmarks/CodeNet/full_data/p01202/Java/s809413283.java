import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			char[] step = sc.next().toCharArray();
			int foot = 0;
			char on = ' ';
			boolean flag = true;
			for (int i = 0; i < step.length; i++) {
				if (step[i] == on) {
					flag = false;
					break;
				}
				on = step[i];
				switch (on) {
				case 'R':
					if (foot == 1) {
						flag = false;
						i = step.length;
					}
					break;
				case 'L':
					if (foot == 0) {
						flag = false;
						i = step.length;
					}
					break;
				}
				foot ^= 1;
			}
			foot = 1;
			on = ' ';
			boolean flag2 = true;
			for (int i = 0; i < step.length; i++) {
				if (step[i] == on) {
					flag2 = false;
					break;
				}
				on = step[i];
				switch (on) {
				case 'R':
					if (foot == 1) {
						flag2 = false;
						i = step.length;
					}
					break;
				case 'L':
					if (foot == 0) {
						flag = false;
						i = step.length;
					}
					break;
				}
				foot ^= 1;
			}

			System.out.println(flag|flag2 ? "Yes" : "No");
			n--;
		}
	}
}