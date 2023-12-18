import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		if (i != j) {
			System.out.println("No");
		} else
			System.out.println("Yes");
		kb.close();
	}

}
