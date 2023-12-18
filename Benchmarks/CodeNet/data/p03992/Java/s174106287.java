import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String s;
		Scanner in = new Scanner(System.in);
		s = in.next();
		s = s.substring(0, 4) + ' ' + s.substring(4,12);
		System.out.print(s);
	}
}
