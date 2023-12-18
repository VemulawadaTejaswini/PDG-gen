import java.util.Scanner;

class Sample {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		Integer num = Integer.parseInt(n.nextLine());
		String ss = s.nextLine();

		if (num % 2 == 1) {
			System.out.println("No");
			return;
		}

		String str = ss.toString().substring(0, num/2);

		if ((str + str).equals(ss.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}