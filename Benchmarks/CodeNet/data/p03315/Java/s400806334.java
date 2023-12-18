import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] ch = scanner.next().toCharArray();
		int i = 0;
		for(int r = 0; r < 4; r++) {
			if(ch[r] == '+') {
				i++;
			}else {
				i--;
			}
		}
		System.out.println(i);
	}

}