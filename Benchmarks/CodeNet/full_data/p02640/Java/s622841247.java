import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		boolean e = false;
		int a = x * 2;
		for (int i = 0; i < x; i++) {
			if (a == y) {
				e = true;
				break;
			} else {
				a += 2;
			}
		}
		if (e == false)
			System.out.println("No");
		else
			System.out.println("Yes");
		kb.close();
	}

}
