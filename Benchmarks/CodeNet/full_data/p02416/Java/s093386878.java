import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0, num = 0;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				int count = 0;
				str = sc.nextLine();

				for(i = 0; i < str.length(); i++) {
					num = Integer.parseInt(str.substring(i,i + 1));
					count += num;
				}
				if(num == 0 && i == 1) {
					break;
				}
				System.out.println(count);
			}
		}
	}
}

