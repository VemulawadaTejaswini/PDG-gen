import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s = scanner.next().split("");
		int count = 0;

		for (int i = 0 ; i < s.length / 2; i++) {
			count = 0;
			for(int j = i ; j < s.length ; j++) {
				if(s[j].equals(s[i])) {
					count++;
				}
				if ((j - i + 1 > 2) && (count > (j - i + 1) / 2)) {
					System.out.println((i+1) + " " + (j+1));
					return;
				}
			}
		}
		System.out.println("-1 -1");
	}
}
