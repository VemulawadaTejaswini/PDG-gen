import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		int ans1 =  a.length() - a.replace("a", "").length();
		int ans2 =  b.length() - b.replace("b", "").length();
		int ans3 =  c.length() - c.replace("c", "").length();

		if (ans1 >= ans2 && ans1 >= ans3) System.out.println("A");
		else if (ans2 >= ans3) System.out.println("B");
		else System.out.println("C");

		sc.close();
	}

}
