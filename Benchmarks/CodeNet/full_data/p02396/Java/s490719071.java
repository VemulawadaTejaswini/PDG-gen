public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = "";
		do {
			int i = 1;
			int x = sc.nextInt();
			if (x == 0) { break; }
			str = str +"Case " + i + ": " + x + "\n";
			i++;
		} while (true);
		System.out.print(str);
	}
}