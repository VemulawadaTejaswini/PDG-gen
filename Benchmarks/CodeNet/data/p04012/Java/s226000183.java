import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		String input = sc.next();
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		int N = sortedString.length();
		int cnt = 0;
		char tmpVal = sortedString.charAt(0);
		
		if (N <= 1) {
			System.out.println("No");
			return;
		}
		for (int i = 0; i < N; i++) {
			char val = sortedString.charAt(i);
			if (val==tmpVal) {
				cnt++;
			} else {
				if (cnt % 2!=0) {
					System.out.println("No");
					return;
				}
				cnt = 1;
				tmpVal = val;
			}
		}
		System.out.println("Yes");
	}
}