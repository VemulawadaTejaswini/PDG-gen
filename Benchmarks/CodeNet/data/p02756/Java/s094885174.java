import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		StringBuilder sb = new StringBuilder(10^5);
		sb.append(s);
		int q = scan.nextInt();
		boolean isF = true;

		for (int i = 0; i < q ; i++) {
			switch(scan.nextInt()) {
			case 1:
				isF = isF ? false : true;
				break;
			case 2:
				switch(scan.nextInt()) {
				case 1:
					sb.insert(isF ? 0 : sb.toString().length() , scan.next());
					break;
				case 2:
					sb.insert(isF ? sb.toString().length() : 0 , scan.next());
					break;
				}
				break;
			}
		}
		System.out.println(isF ? sb.toString() : sb.reverse());

	}

}