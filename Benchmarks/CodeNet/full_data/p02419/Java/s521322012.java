import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String line1 = sc.next();
		while (true) {
			String line2 = sc.next();
			if(line2.equals("END_OF_TEXT")) {
				break;
			}else {
				if(line2.equals(line1)) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}