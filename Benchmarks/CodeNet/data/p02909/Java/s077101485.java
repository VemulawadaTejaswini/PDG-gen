import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		String s = "Sunny";
		String c = "Cloudy";
		String r = "Rainy";

		if(w.equals(s)) {
			System.out.println(c);
		}else if(w.equals(c)) {
			System.out.println(r);
		}else if(w.equals(r)) {
			System.out.println(s);
		}


	}

}