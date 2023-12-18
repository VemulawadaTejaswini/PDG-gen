import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] array = s.split("");
		int ans = 0;
		int len = s.length();

		while(true) {
			boolean flag = true;
			for(int i=0;i<len-1;i++) {
				String s1 = array[i];
				String s2 = array[i+1];
				if(s1.equals("B")&&s2.equals("W")) {
					array[i] = "W";
					array[i+1] = "B";
					ans = ans+1;
					flag = false;
				}
			}
			if(flag) {
				System.out.println(ans);
				return;
			}
		}
	}
}
