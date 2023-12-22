import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		for(int i=0;i<string.length();i++) {
			char temp = string.charAt(i);
			if('a'<=temp&&temp<='z') {
				System.out.print((char)(temp-32));
			}else if('A'<=temp&temp<='Z') {
				System.out.print((char)(temp+32));
			}else {
				System.out.print(temp);
			}
		}
		System.out.println();
		scanner.close();
	}
}
