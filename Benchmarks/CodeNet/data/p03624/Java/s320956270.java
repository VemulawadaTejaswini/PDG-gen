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
		
		if(S[0] >= 98) {
			System.out.println("a");
		} else if(S.length == 1) {
			if(S[0] >= 98) {
				System.out.println("a");
			} else {
				System.out.println("b");
			}
		} else {
			for(int i = 0; i < S.length - 1; i++) {
				if(S[i] >= S[i + 1] - 1) {
					if(i == S.length - 2 && S[i + 1] != 122) {
						System.out.println((char)(S[i + 1] + 1));
					} else if(i == S.length - 2 && S[i + 1] == 122) {
						System.out.println("None");
					}
				} else {
					System.out.println((char)(S[i] + 1));
					break;
				}
			}
		}
	}
}
