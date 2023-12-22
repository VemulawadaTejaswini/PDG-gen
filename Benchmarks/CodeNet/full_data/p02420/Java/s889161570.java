import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str.equals("-"))
				break;
			int m = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < m; i++) {
				String nextStr = sc.nextLine();
				str = new StringBuilder()
						.append(str.substring(Integer.parseInt(nextStr)))
						.append(str.substring(0, Integer.parseInt(nextStr)))
						.toString();
			}
				System.out.println(str);
		}
		sc.close();
	}
}