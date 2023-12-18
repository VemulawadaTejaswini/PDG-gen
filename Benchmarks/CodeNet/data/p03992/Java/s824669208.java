import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int paircount = 0;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Integer i = Integer.parseInt(s);
		String s2 = scan.nextLine();
		scan.close();
		String[] stringArray = s2.split(" ");
		for (int x = 1; x < i; x++) {
			String xlikes = stringArray[x-1];
			if (Integer.parseInt(stringArray[Integer.parseInt(xlikes)-1]) == x && Integer.parseInt(xlikes) != x) {
				paircount++;
			}
		}
		System.out.println((paircount+1)/2);
	}
}