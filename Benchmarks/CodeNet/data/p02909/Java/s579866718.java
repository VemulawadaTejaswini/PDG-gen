import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = "Sunny";
		String s2 = "Cloudy";
		String s3 = "Rainy";
		String s = sc.next();
		String ans = "";
		if(s.equals(s1))
			ans = s2;
		else if(s.equals(s2))
			ans = s3;
		else if(s.equals(s3))
			ans = s1;
		sc.close();
		System.out.println(ans);

	}
}

