import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		for (int i=A; i<B; i++) {
			char[] s = String.valueOf(i).toCharArray();
			boolean inflg = true;
			for (int j=0; j<s.length/2; j++) {
				if (s[j] != s[s.length-1-j]) {
					inflg = false;
				}
			}
			if (inflg) res++;
		}
		System.out.println(res);
	}
}
