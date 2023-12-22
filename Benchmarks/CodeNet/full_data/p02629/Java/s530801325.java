import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong() - 1L;
		int b = 0;
		int[] c = new int[b];
		int[] c2 = new int[b];
		while(n >= 0) {
			c = new int[b];
			c = c2;
			c2 = new int[b+1];
			System.arraycopy(c, 0, c2, 0, b);

			c2[b] = (int)n % 26;
			n /= 26L;
			n -= 1L;
			b++;
		}

		for(int i=c2.length-1; i>=0; i--) {
			isAlfabet(c2[i]);
		}
	}
	private static void isAlfabet(int num) {
		String[] s = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		System.out.print(s[num]);
		//System.out.println(num);
	}
}
