import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int[] S = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			S[i] = s.charAt(i);
		}
		
		Arrays.sort(S);
		int check = 0;
		
		for(int i = 0; i < S.length - 1; i++) {
			if(S[i] >= S[i + 1] - 1 && S[0] == 97) {
				continue;
			} else if(S[0] >= 98) {
				System.out.println("a");
				break;
			} else {
				System.out.println((char)(S[i] + 1));
				check++;
				break;
			}
		}
		
		if(S.length == 1) {
			if(S[0] == 97) {
				System.out.println("b");
				check++;
			} else {
				System.out.println("a");
				check++;
			}
		}
		
		if(check == 0) {
			System.out.println("None");
		}
	}
}
