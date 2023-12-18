import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		String s = a+b;
		int n = Integer.valueOf(s);
		String ans = "No";
		for(int i = 0; i < 320;i++) {
			if(i*i==n) {
				ans="Yes";
			}
		}
		System.out.println(ans);
	}

}
