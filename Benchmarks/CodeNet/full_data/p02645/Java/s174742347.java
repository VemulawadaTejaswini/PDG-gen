import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int length = S.length();
		Random random = new Random();
		int randomint = random.nextInt(length);
		int a = randomint-4;
		int b = a+1;
		int c = a+2;

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < length ;) {
			list.add(S.substring(i, ++i));
		}

//		System.out.println(list);

		String nickname = list.get(a)+(list.get(b))+(list.get(c));

		System.out.println(nickname);



	}

}
