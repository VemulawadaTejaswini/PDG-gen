import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		try(Scanner scan = new Scanner(System.in)) {
			while(true) {
				num = scan.nextInt();
				if(num == 0) {
					break;
				}
				list.add(num);
			}
			for(int i = 0; i < list.size(); i++) {
				System.out.println("Case " + (i + 1) + ": " + list.get(i));
			}
		}
	}

}