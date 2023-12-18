import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char[] si = str.toCharArray();
		int count = 0;

		for (int i = 0; i < si.length; i++) {
			if(si[i]== '1') {
				count++;
			}
		}

		System.out.println(count);
	}

}
