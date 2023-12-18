import java.util.Scanner;

public class test {
	public static void main(String[] args)	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
    str = str.replace(',', ' ');
		System.out.println(str);
		scan.close();
	}
}
