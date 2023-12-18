import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String b = sc.nextLine();

		System.out.println(b.equals("A") ? "T" : b.equals("G") ? "C" : b.equals("C") ? "G" : "A");
	}

}