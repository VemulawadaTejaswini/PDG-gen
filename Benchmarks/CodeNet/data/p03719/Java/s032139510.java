import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String ans = "No";

		if(a<=c&&c<=b) {
			ans = "Yes";
		}
		System.out.println(ans);
	}

}