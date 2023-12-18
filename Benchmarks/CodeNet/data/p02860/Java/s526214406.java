import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		sc.close();
		if((n + 2) % 2 != 0) {
			System.out.println("No");
			return;
		}
      if(n == 2){
        System.out.println(s.charAt(0) == s.charAt(1) ? "Yes" : "No");
        return;
      }
		System.out.println(s.substring(0, n / 2 - 1).equals(s.substring(n / 2, n - 1)) ? "Yes" : "No");

	}
}

