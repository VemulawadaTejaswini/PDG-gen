
import java.util.Scanner;

class Dice{
	public int Top;
	public int Front;
	public int Right;
	public int left;
	public int Back;
	public int Bottom;


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
		int Topch = Top;
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
		int i = 0, j = 0;
		Dice a[];
		int f=0;
		int n = sc.nextInt();
		a = new Dice[n];
		for (i = 0; i < n; i++)
			a[i] = new Dice();

		for (i = 0; i < n; i++) {
			a[i].Top = sc.nextInt();
			a[i].Front = sc.nextInt();
			a[i].Right = sc.nextInt();
			a[i].left = sc.nextInt();
			a[i].Back = sc.nextInt();
			a[i].Bottom = sc.nextInt();
		}

		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				String str = "";
				int test1, test2;
				test1 = a[i].Top;
				test2 = a[i].Front;

				if (test1 == a[j].Front) {
					str = str + "N";
				} else if (test1 == a[j].Right) {
					str = str + "W";
				} else if (test1 == a[j].left) {
					str = str + "E";
				} else if (test1 == a[j].Back) {
					str = str + "S";
				} else if (test1 == a[j].Bottom) {
					str = str + "NN";
				} else if (test1 == a[j].Top) {
					str = "";
				} else {
					System.out.println("No");
					f=1;
					break;
				}

				char data[] = new char[str.length()];
				data = str.toCharArray();
				for (int t = 0; t < str.length(); t++) {
					switch (data[t]) {
					case 'W':
						a[j].W();
						break;
					case 'S':
						a[j].S();
						break;
					case 'N':
						a[j].N();
						break;
					case 'E':
						a[j].E();
						break;
					default:
						break;
					}
				}
				if (test2 == a[j].Right) {
					str = "WSE";
				} else if (test2 == a[j].left) {
					str = "ESW";
				} else if (test2 == a[j].Back) {
					str = "SSEE";
				} else if (test2 == a[j].Front) {
					str = "";
				} else {
					System.out.println("No");
					break;
				}
				data = str.toCharArray();
				for (int t = 0; t < str.length(); t++) {
					switch (data[t]) {
					case 'W':
						a[j].W();
						break;
					case 'S':
						a[j].S();
						break;
					case 'N':
						a[j].N();
						break;
					case 'E':
						a[j].E();
						break;
					default:
						break;
					}
				}
				if (test(a[i],a[j])) {
					System.out.println("No");
					f=1;
					break;
				}
			}
			if (f==1)
				break;
		}
		if (f==0)System.out.print("Yes");
		sc.close();
	}
	public static Boolean test(Dice a,Dice b) {
		if(a.Top==b.Top&&a.Front==b.Front&&a.Right==b.Right&&a.left==b.left&&a.Back==b.Back&&a.Bottom==b.Bottom) {
			return true;
		}else {
			return false;
		}

	}


}


