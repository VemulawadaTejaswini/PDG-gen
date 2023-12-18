import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n % 2 == 1) {
			System.out.println("No");
			return;
		}

        String s = sc.next();
        String s1, s2;
        s1 = s.substring(0, n/2);
        s2 = s.substring(n/2);

        String ans = (s1.equals(s2)) ? "Yes" : "No";
        System.out.println(ans);

        return;
    }
}