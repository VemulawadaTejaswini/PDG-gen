import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		boolean isBlack[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			isBlack[i] = str.charAt(i) == '#';
		}
		int countBlack[] = new int[num];
		int countWhite[] = new int[num];
		countBlack[0] = isBlack[0] ? 1 : 0;
		countWhite[0] = 1 - countBlack[0];
		for(int i = 1; i < num; i ++) {
			countBlack[i] = countBlack[i - 1] + (isBlack[i] ? 1 : 0);
			countWhite[i] = i + 1 - countBlack[i];
		}
		int numBlack = countBlack[num - 1];
		int numWhite = countWhite[num - 1];
		int need[] = new int[num + 1];
		need[0] = numWhite;
		for(int i = 1; i < num; i ++) {
			need[i] = countBlack[i - 1] + numWhite - countWhite[i];
		}
		need[num] = numBlack + numWhite - numWhite;

		int min = need[0];
		for(int i = 0; i <= num; i ++) {
			min = Math.min(min, need[i]);
		}
		System.out.println(min);
	}
}