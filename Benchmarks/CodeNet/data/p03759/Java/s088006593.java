import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if(b-a==c-b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}