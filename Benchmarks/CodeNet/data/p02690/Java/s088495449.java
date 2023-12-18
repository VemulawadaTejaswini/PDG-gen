import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		List<Long> list = new ArrayList<>();
		for (long i = 0; i < 130; i++) {
			list.add(i*i*i*i);
		}
		long max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (x <= list.get(i)) {
				max = i;
				break;
			} else if (x == list.size()-1) {
				max = i;
				break;
			}
		}
		for (long i = (-1) * max; i <= max ; i++) {
			for (long j = (-1) * max; j <= max ; j++) {
				long cal = i*i*i*i*i - j*j*j*j*j;
				if ( cal == x) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}

	}

}
