import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();
		list.add("SUN"); list.add("MON"); list.add("TUE");
		list.add("WED"); list.add("THU"); list.add("FRI");
		list.add("SAT");
		System.out.println(7-list.lastIndexOf(sc.next()));
		sc.close();
	}
}