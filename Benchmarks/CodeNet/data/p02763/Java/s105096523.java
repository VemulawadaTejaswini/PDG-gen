import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		char s[] =scan.next().toCharArray();
		int q = scan.nextInt();
		for(int k = 0 ; k < q ; k++) {
			if(scan.nextInt() == 1) {
				int i = scan.nextInt();
				char c[] = scan.next().toCharArray();

				s[i-1] = c[0];

			}else {
				int l = scan.nextInt();
				int r = scan.nextInt();
				List<Character> list = new ArrayList<>();
				for(int i = l-1 ; i < r ; i++) {
					list.add(s[i]);
				}
				System.out.println(new HashSet<>(list).size());
			}
		}

	}
}
