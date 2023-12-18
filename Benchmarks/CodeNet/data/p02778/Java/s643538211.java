import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  //文字列S
		int sCount = 0;  //Sの文字数カウント変数

		sCount = s.length();

		//文字数分for文を回してxを表示
		for(int i=1 ; i<=sCount ; i++) {
			System.out.print("x");
		}
		sc.close();
	}
}