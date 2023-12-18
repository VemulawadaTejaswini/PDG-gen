import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String kanri = s[0];
		for(int i = 1; i< 3;i++) {
			if(kanri.equals(s[i])) {
				continue;
			}else {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}
}