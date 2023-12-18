import java.util.Scanner;
class poor{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boolean poor = false;
		if (!(a==b & b==c)) {
			if (a==b || b==c || a==c) {
				poor = true;
			}
		}
		System.out.print(poor?"Yes":"No");

	}
}