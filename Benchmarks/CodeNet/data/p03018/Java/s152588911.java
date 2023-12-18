
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int sta = 0;
		int Acont = 0;
		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			switch (sta) {
			case 0:
				if(S.charAt(i) == 'A') {
					Acont++;
				} else if(S.charAt(i) == 'B') {
					sta++;
				} else {
					sta = 0;
					Acont = 0;
				}
				break;
			case 1:
				if(S.charAt(i) == 'A') {
					Acont = 1;
					sta--;
				} else if(S.charAt(i) == 'C') {
					count += Acont;
					sta--;
				} else {
					sta--;
					Acont = 0;
				}
				break;
			}
		}
		System.out.println(count);
	}

}
