
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.nextLine();
			if (a.equals("0"))
				break;
			int sum = 0;
			for (String b : a.split("")) {
				sum += Integer.parseInt(b);
			}
			System.out.println(sum);
		}
	}
}