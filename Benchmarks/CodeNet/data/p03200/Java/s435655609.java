import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		int index = s.indexOf("BW");
		while(index != -1) {
			count += index + 1;
			s = s.substring(0, index) + "B" + s.substring(index + 2);
			index = s.indexOf("BW");
		}

		System.out.println(count);
	}
}
