import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.replaceAll("apple","???");
		str = str.replaceAll("peach","apple");
		str = str.replaceAll("???","peach");
		System.out.println(str);
		sc.close();
		
	}

}