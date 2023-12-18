import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Year {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		String date = scanner.nextLine();
		System.out.println(sdf.format(date));
	}
}