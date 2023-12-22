
import java.util.LinkedList;
import java.util.Scanner;

class Main {

	/*
	 * 着席位置：ホワイトボード向かって右側の前から３番目
	 * 問題：コッホ曲線
	 */

	private static LinkedList<double[]> points;
	private static final int X=0, Y=1;//0と1だと混乱するため

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();

		points = new LinkedList<>();
		double[] a = {0, 0};
		points.add(a);
		double[] b = {100, 0};
		points.add(b);

		koch(a, b, N);

		for(double[] p : points) {
			print(p[X], p[Y]);
		}

	}

	private static void koch(double[] a, double[] b, int N) {
	    if(N==0) return;
		double newp1[] = {(a[X]*2+b[X])/3, (a[Y]*2+b[Y])/3};//１つ目の点寄り
		double newp2[] = {(b[X]*2+a[X])/3, (b[Y]*2+a[Y])/3};//２つ目の点寄り
		double dx = newp2[X]-newp1[X], dy = newp2[Y]-newp1[Y];
		double newp3[] = {newp1[X] +(dx -Math.sqrt(3)*dy)/2, newp1[Y] +(Math.sqrt(3)*dx +dy)/2};//とがるところ・１つ目の点を軸に60°回す
		//配列に順番通りに格納
		int index = points.indexOf(a);
		points.add(index+1, newp1);
		points.add(index+2, newp3);
		points.add(index+3, newp2);
		if(N>=2) {//再帰する
			N--;
			koch(a, newp1, N);
			koch(newp1, newp3, N);
			koch(newp3, newp2, N);
			koch(newp2, b, N);
		}

	}

	private static void print(double x, double y) {
		System.out.printf("%f %f", x, y);
		System.out.println();
	}

}

