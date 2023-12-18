import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int length = n.length();

		long cnt = 1;
		int point = 1;

		String beforeStr = n.substring(0,1);

		while(true) {
			String str = n.substring(point,point + 1);

			if(str.equals(beforeStr)) {
				if(point + 2 >= length) {
					break;
				}

				beforeStr = n.substring(point, point + 2);
				point += 2;
			}else {
				beforeStr = str;
				point++;
			}

			cnt++;
			if(point >= length) {
				break;
			}
		}

		System.out.println(cnt);
	}
}