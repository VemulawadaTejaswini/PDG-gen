import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String ans = "";
		if(s.equals("Sunny")) ans = "Cloudy";
		else if(s.equals("Cloudy")) ans = "Rainy";
		else ans = "Sunny";
		System.out.println(ans);
		in.close();

	}

}
