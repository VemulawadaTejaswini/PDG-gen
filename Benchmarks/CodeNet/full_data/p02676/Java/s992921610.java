import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		if(i < s.length()) {
			System.out.println(s.substring(0,i) + "...");
		}else {

			System.out.println(s);
		}

	}
}
