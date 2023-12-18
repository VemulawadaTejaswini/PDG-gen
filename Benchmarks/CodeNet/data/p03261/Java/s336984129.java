import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] str = new String[N];
		for (int i = 0; i < str.length; i++) {
			String compare = str[0];
			if(compare.equalsIgnoreCase(str[i])){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
		scan.close();
	}
}