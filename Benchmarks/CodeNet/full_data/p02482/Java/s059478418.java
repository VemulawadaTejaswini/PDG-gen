import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = " == ";
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(x>y)
			s = " > ";
		else if(x<y)
			s = " < ";
		System.out.println(x + s + y);
		scanner.close();
	}
}