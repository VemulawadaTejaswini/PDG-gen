import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[]st = {
				"dream",
				"dreamer",
				"erase",
				"eraser"
		};
		Scanner sc = new Scanner(System.in);
		String inputString = sc.toString();
		boolean equalFlag = false;

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(inputString.endsWith(st[i])) {
					String temString = inputString.replaceAll(st[i], "");
					if(temString.startsWith(st[j])) equalFlag = true;
				}
			}
		}

		String result = equalFlag ? "Yes" : "No";
		System.out.println(result);
	}

}