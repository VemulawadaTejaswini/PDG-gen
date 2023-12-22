import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		Set<Long> set = new HashSet<>();

		for(int i = 0;i < s.length() - 1;i++) {
			for(int j = i + 3;j < s.length() - 1;j++) {
				for(int k = 0;(j + k) <= s.length();k++) {
					long n = Long.parseLong(s.substring(i, j + k));
					if(n % 2019 == 0) {
						if(!set.contains(n)) {
							set.add(n);
							count++;
						}
					}
				}

			}
		}

		System.out.println(count);
    }
}