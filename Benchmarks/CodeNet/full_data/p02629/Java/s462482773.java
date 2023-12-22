import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());


		String ans = "";
		while(n != 0) {
			char tmp = (char) (n%26 +96);
			n /= 26;
			ans = tmp + ans;
		}
		System.out.println(ans);
	}
}


