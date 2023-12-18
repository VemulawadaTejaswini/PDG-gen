import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int L = S.length();

		int count = 0;
		for(int i=0; i<L; i++) {
			if(S.charAt(0) == 'C') {
				count += 1;
			}
		}if(count == 1) {
			if(S.charAt(0) == 'C') {
				int judge = 0;
				for(int j=0; j<L; j++) {
					if(Character.isUpperCase(S.charAt(j))) {
						judge += 1;
					}
				}if(judge == 2) {
					if(S.charAt(0) == 'A') {
					System.out.println("AC");
					}
				}
			}
		}else {
			System.out.println("WA");
		}

	}

}
