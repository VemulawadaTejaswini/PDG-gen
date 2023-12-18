import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long X = in.nextLong();
		long Y = in.nextLong();
		List<Long> list = new ArrayList<>();
		for (long i = X; i <= Y; i *= 2) {
			list.add(i);
		}
		System.out.println(list.size());
		in.close();
	}
}