import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int x_2000 = Integer.parseInt(sc.next());
		sc.close();

		//logic
		for(int i = 2001; i <= 2010; i++) {
			System.out.println(saiki(r, D, x_2000, i));
		}
	}

	public static int saiki(int r,int D, int x, int k) {
		if (k == 2000) {
			return x;
		}else {
			return r * saiki(r, D, x, k-1) - D;
		}
	}

}
