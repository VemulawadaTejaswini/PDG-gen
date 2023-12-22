import java.util.Scanner;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int	x = Integer.parseInt(s.next()),
			y = Integer.parseInt(s.next());
		System.out.print  (x*y);
		System.out.print  (" ");
		System.out.println((x+y)*2);
	}
}