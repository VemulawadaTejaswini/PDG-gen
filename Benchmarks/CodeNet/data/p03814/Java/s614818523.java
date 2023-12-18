import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int A = 0, Z = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == 'A') {
				A = i;
				break;
			}
		}
		for(int i = s.length; i > A; i--) {
			if(s[i - 1] == 'Z') {
				Z = i;
				break;
			}
		}
		System.out.println(Z - A);
	}

}
