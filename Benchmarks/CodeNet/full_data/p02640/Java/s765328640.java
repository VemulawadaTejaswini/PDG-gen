import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int animal = in.nextInt();
		int foot = in.nextInt();

		double t = (foot-2*animal)/2;

		int r = (int)t;

		if(t-r==0&&r<=animal) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
