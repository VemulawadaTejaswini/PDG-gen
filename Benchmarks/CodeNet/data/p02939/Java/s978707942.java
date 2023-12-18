import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		long cnt = 1;
		String beforeStr = n.substring(0,1);
		n = n.substring(1);

		while(true) {
			String str = n.substring(0,1);

			if(str.equals(beforeStr)) {
				if(1 >= n.length()) {
					break;
				}

				beforeStr = n.substring(0, 2);
				n = n.substring(2);
			}else {
				beforeStr = str;
				n = n.substring(1);
			}

			cnt++;
			if(0 >= n.length()) {
				break;
			}
		}

		System.out.println(cnt);
	}
}