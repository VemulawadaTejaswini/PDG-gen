import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = S.toCharArray();
		for(char c: charArray) {
			int targetIndex = c + 2;
			if(targetIndex == 91) {
				targetIndex = 65;
			} else if(targetIndex == 92) {
				targetIndex = 66;
			}
			char changedChar = (char)targetIndex;
			sb.append(changedChar);
		}
		
		System.out.println(sb);
		scan.close();
	}
}