
import java.util.Scanner;

class Dice{
	public int Top;
	public int Front;
	public int Right;
	public int left;
	public int Back;
	public int Bottom;

	public Dice() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void W() {
		int Topch = Top;
		int leftch = left;
		Top = Right;
		Right = Bottom;
		left = Topch;
		Bottom = leftch;
	}
	public void E() {
		int Topch = Top;
		int Rightch = Right;
		Top = left;
		Right = Topch;
		left = Bottom;
		Bottom = Rightch;
	}

	public void S() {
		int Topch  =Top;
		int Frontch = Front;
		Top = Back;
		Front = Topch;
		Back = Bottom;
		Bottom = Frontch;
	}

	public void N() {
		int Topch = Top;
		int Backch = Back;
		Top = Front;
		Front = Bottom;
		Back = Topch;
		Bottom = Backch;
	}


}


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice a = new Dice();

		a.Top = sc.nextInt();
		a.Front = sc.nextInt();
		a.Right = sc.nextInt();
		a.left = sc.nextInt();
		a.Back = sc.nextInt();
		a.Bottom = sc.nextInt();
		String str = sc.next();

		char data[] = new char[str.length()];
		data = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			switch(data[i]) {
			case 'W':
				a.W();
				break;
			case'S':
				a.S();
				break;
			case'N':
				a.N();
				break;
			case'E':
				a.E();
				break;
			default:
				break;
			}
		}


		System.out.println(a.Top);

		sc.close();
	}
}



