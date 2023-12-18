import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		long B = scn.nextLong();
		long C = scn.nextLong();
		long D = scn.nextLong();
		long ans = B - A + 1;
		long ansC = 0, ansD = 0, ansCD = 0;
		if (A == B) {
			System.out.println((A % C == 0) || (A % D == 0) ? 0 : 1);
		} else {
			if (C == D) {
				if (C <= B) {
					if (A % C == 0) {
						ansC = (B - A) / C + 1;
					} else {
						ansC = (B - (A + (C - A % C))) / C + 1;
					}
				}
			} else {
				if (C <= B) {
					if (A % C == 0) {
						ansC = (B - A) / C + 1;
					} else {
						ansC = (B - (A + (C - A % C))) / C + 1;
					}
				}
				if (D <= B) {
					if (A % D == 0) {
						ansD = (B - A) / D + 1;
					} else {
						ansD = (B - (A + (D - A % D))) / D + 1;
					}
				}
				if (C * D <= B) {
					if (A % (C * D) == 0) {
						ansCD = (B - A) / (C * D) + 1;
					} else {
						ansCD = (B - (A + ((C * D) - A % (C * D)))) / (C * D) + 1;
					}
				}
			}
			System.out.println(ans + ansCD - ansC - ansD);
		}
	}
}