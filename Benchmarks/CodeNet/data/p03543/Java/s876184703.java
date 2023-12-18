import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();
		if(c[0] == c[1] && c[1] == c[2] || c[1] == c[2] && c[2] == c[3]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
