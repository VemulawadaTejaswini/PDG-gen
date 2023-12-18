import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 複数行の標準入力
		ArrayList<String> strList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String buf = in.nextLine();
			strList.add(buf);
		}
		in.close();

		int n = Integer.parseInt(strList.get(0));
		String a = strList.get(1);

		System.out.println(Integer.toString(n));
	}
}
