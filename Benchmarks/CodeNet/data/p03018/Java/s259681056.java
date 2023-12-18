
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			char[] str = sc.next().toCharArray();
			char A = 'A';
			char B = 'B';
			char C = 'C';

			int count = 0;
			int acount = 0;
			for (int i = 0; i < str.length - 2; i++) {
				if (str[i] == A) {
					acount = 1;
					for (int j = i + 1; j < str.length - 1;) {
						if (str[j] == A) {
							acount++;
							j++;
							if (str.length - 1 <= j) {
								i = str.length;
								break;
							}
						} else if(str[j] == B && str[j+1] == C){
							count += acount;
							j += 2;
							if (str.length - 1 <= j) {
								i = str.length;
								break;
							}
						} else {
							i = j;
							break;
						}
					}
				}
			}

			System.out.println(count);
		}
	}
}
