import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] array = s.split("");
		long ans = 0L;
		long tmp = 0L;

		for(int i = 0;i<s.length();i++) {
			if(array[i].equals("W")) {
				ans = ans + tmp;
			}else {
				tmp = tmp + 1L;

			}
		}

		System.out.println(ans);
	}
}
