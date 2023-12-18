import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String b = "Good";
		String a = sc.nextLine();
		String[] ar = a.split("");
		String c = "";
		String d = "";
		for(int i = 0 ; i < 3 ; i++) {
			n = i+1;
			c = ar[i];
			d = ar[n];
			if(c.equals(d)) {
				b = "Bad";
			}
		}
		System.out.println(b);
	}
}
