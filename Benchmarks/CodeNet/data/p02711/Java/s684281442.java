import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = new String[3];
		n = sc.next().split(""); String msg = "";
		for(int i = 0; i < n.length; i++) {
			if (n[i].equals("7")) msg = "Yes";
			else msg = "No";
		}
		System.out.println(msg);
	}
}
