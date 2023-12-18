import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] str=(new Scanner(System.in).nextLine().split(" "));
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		int r=b/(a-1);
		System.out.println(a*r>=b?r:r+1);
	}
}