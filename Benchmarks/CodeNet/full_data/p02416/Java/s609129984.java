import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			String n = scan.next();
			if(n.equals("0")) {
				break;
			}
			int sum = 0;
			for(int i = 0; i < n.length(); i++) {
				sum += Integer.parseInt(n.substring(i, i + 1));
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
