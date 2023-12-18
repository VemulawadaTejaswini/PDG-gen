import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S1 = sc.next();
		String S2 = sc.next();

		sc.close();

		long score = 1;
		boolean hor = false;
		for(int i = 0; i < S1.length(); i++) {
			if(i == 0) {
				if(S1.charAt(0) == S1.charAt(1) ) {
					score *= 6;
					hor = true;
					i++;
				}else {
					score *= 3;
					hor = false;
				}
			}else {
				if(S1.charAt(i) == S1.charAt(i+1)) {
					if(hor) {
						score *= 3;
					}else {
						score *= 2;
					}
					hor = true;
					i++;
				}else {
					if(hor) {

					}else {
						score *=2;
					}
					hor = false;
				}
			}
		}

		System.out.println(score);
	}

}
