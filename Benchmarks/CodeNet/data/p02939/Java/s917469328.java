import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String n[] = sc.nextLine().split("");
		int length = n.length;

		long cnt = 1;
		int point = 1;

		String beforeStr = n[0];

		while(true) {
			String str = n[point];

			if(str.equals(beforeStr)) {
				if(point + 2 >= length) {
					break;
				}

				beforeStr = n[point] + n[point + 1];
				point += 2;
			}else {
				beforeStr = n[point];
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