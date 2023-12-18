import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = -1+str.length();
		String result = "x";
		for(int i = 0;i < num;i++) {
			result += "x";
		}

		System.out.println(result);
		scan.close();
	}
}