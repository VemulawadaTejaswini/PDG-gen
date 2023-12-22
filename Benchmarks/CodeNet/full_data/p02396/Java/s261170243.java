public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do {
			int i = 1;
			int x = sc.nextInt();
			if (x == 0) { break;}
			System.out.println("Case " + i + ": " + x);
			++ i ;
		} while (true);
	}
}