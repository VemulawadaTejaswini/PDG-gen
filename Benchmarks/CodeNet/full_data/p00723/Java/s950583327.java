import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String[] result = new String[8];
			Set<String> set = new HashSet<String>();
			String train = sc.next();
			for (int k = 1; k < train.length(); k++) {
				String front = train.substring(0, k);
				String back = train.substring(k);
				StringBuilder fsb = new StringBuilder(front);
				StringBuilder bsb = new StringBuilder(back);
				fsb.reverse();
				String revFront = fsb.toString();
				bsb.reverse();
				String revBack = bsb.toString();
				result[0] = train;
				result[1] = back + front;
				result[2] = revFront + back;
				result[3] = front + revBack;
				result[4] = back + revFront;
				result[5] = revBack + front;
				result[6] = revFront + revBack;
				result[7] = revBack + revFront;
				for (int j = 0; j < 8; j++) {
					set.add(result[j]);
				}
			}
			System.out.println(set.size());
		}
	}
}