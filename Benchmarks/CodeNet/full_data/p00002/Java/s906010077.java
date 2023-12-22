import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			String []n = s.split(" ");
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			String t = Integer.toString(a + b);
			System.out.println(t.length());
		}
		sc.close();
	}
}
