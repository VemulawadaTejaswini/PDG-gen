import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();

		StringBuffer sbBef = new StringBuffer();
		StringBuffer sbAft = new StringBuffer();
		boolean reverse = false;

		for (int i=0; i<Q; i++){
			int T = sc.nextInt();
			if (T == 1){
				reverse = !reverse;
			} else {
				int F = sc.nextInt();
				char C = sc.next().charAt(0);
				if ((F == 1 && !reverse) || (F == 2 && reverse)) {
					sbBef.append(C);
				} else {
					sbAft.append(C);
				}
			}
		}
		if (reverse) {
			System.out.println(sbAft.reverse().toString() + S + sbBef.toString());
		} else {
			System.out.println(sbBef.reverse().toString() + S + sbAft.toString());
		}

	}
}