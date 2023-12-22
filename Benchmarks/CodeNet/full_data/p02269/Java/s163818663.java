
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();				//入力数
		List<String> Dic = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String Command = scan.next();
			String str = scan.next();
			if (Command.equals("insert")) {
				Dic.add(str);
			} else {
				if (Dic.contains(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		scan.close();
	}
}



