mport java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		String ans = "";
		sc.close();
		for(int i = 0;i < c.length;i += 2) {
			ans += c[i];
		}
		System.out.println(ans);
	}
}