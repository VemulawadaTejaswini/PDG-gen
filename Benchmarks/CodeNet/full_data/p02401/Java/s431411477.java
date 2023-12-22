import java.util.Scanner;

//20180508
//04

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			int ans = 0;

			if("+".equals(op)) {
				ans = a + b;
			}
			if("-".equals(op)) {
				ans = a - b;
			}
			if("*".equals(op)) {
				ans = a * b;
			}
			if("/".equals(op)) {
				ans = a / b;
			}
			if("?".equals(op)) {
				break;
			}
			System.out.println(ans);
		}

    	scanner.close();
    }
}
