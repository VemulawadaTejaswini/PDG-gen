import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.nextLine();
		System.out.println(s.contains("Y") ? "Four" : "Three");
		sc.close();
	}

}
