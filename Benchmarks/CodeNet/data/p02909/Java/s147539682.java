import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		var weathers = new ArrayList<String>();
		weathers.add("Sunny");
		weathers.add("Cloudy");
		weathers.add("Rainy");

		int index = weathers.indexOf(s);
		System.out.println(weathers.get((index + 1) % 3));
	}
}
