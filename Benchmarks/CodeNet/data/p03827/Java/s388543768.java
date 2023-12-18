import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int count = 0,ans=0;

		for (char c : S) {
			if(c == 'I') count++;
			else count--;
			if(ans < count) ans = count;
		}

		System.out.println(ans);
	}
}