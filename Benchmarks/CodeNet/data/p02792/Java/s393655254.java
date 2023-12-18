import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if(checkNum(i,j)) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	private static boolean checkNum(int i, int j) {
		String a = String.valueOf(i);
		String b = String.valueOf(j);

		if(a.charAt(0) == b.charAt(b.length()-1) && a.charAt(a.length()-1) == b.charAt(0)) {
			return true;
		}
		return false;
	}
 }