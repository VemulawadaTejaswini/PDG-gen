import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		char[] aList = a.toCharArray();
		char[] bList = b.toCharArray();
		char[] cList = c.toCharArray();

		int count = 0;
		for(int i = 0; i < n; i++) {
			char aChar = aList[i];
			char bChar = bList[i];
			char cChar = cList[i];

			if(aChar == bChar) {
				if(aChar == cChar) {
					// 3つ一緒なら変えない
				} else {
					// 2つ一緒なら1個変える
					count++;
				}
			} else if(aChar == cChar) {
				// 2つ一緒なら1個変える
				count++;

			} else if(bChar == cChar) {
				// 2つ一緒なら1個変える
				count++;

			} else {
				// 全部違ったら2つ変える
				count += 2;
			}

		}


		System.out.println(count);


	}

}
