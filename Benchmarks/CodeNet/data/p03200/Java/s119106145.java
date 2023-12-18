import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] array = s.split("");
		int ans = 0;
		int tmp = 0;
		int len = s.length();

		for(int i = 0;i<len;i++) {
			if(array[i].equals("B")) {
				tmp = tmp+1;
			}else {
				ans = ans + tmp;
			}
		}

		System.out.println(ans);
	}
}
