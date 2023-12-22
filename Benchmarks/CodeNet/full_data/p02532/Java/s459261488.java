import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] data = new String[n][1000];
		int[] pointer = new int[n]; // pushされる位置となるポインタ
		ArrayList<String> out = new ArrayList<String>();

		while (true) {
			String order = sc.next();

			if (order.equals("quit"))

				break;

			else if (order.equals("push")) {

				int number = sc.nextInt() - 1;
				data[number][pointer[number]] = sc.next();
				pointer[number]++;

			} else if (order.equals("pop")) {

				int number = sc.nextInt() - 1;
				out.add(data[number][pointer[number] - 1]);
				pointer[number]--;
				data[number][pointer[number]] = ""; // 消去

			} else {

				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				pointer[from]--;
				data[to][pointer[to]] = data[from][pointer[from]];
				pointer[to]++;
				data[from][pointer[from]] = "";

			}
		}

		for (int i = 0; i < out.size(); i++)
			System.out.println(out.get(i));

	}

}