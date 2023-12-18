import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String word[] = new String[n];
		for (int i = 0; i < n; i++) {
			word[i] = sc.next();
		}
		Arrays.sort(word);
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans += word[i];
		}
		System.out.println(ans);
	}

}
