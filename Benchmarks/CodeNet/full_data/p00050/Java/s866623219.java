import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.replaceAll("apple","peach");
		str = str.replaceAll("Apple","Peach");

		System.out.println(str);
		sc.close();
		
	}

}