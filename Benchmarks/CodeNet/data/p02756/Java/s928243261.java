import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int q = scan.nextInt();
		boolean isF = true;
		for (int i = 0; i < q ; i++) {

			if(scan.nextInt() == 1) {
				isF = isF ? false : true;
			}else {
				if(isF) {
					if(scan.nextInt() == 1) {
						s =scan.next() + s;
					}else {
						s += scan.next();
					}
				}else {
					if(scan.nextInt() == 2) {
						s =scan.next() + s;
					}else {
						s += scan.next();
					}
				}
			}
		}
		if(!isF) {
			StringBuffer str = new StringBuffer(s);
			s = str.reverse().toString();
		}
		System.out.println(s);

	}

}

