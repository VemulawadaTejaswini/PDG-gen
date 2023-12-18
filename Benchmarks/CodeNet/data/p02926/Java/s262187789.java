import java.util.Scanner;

public class Main{

	static long tate = 0;
	static long yoko = 0;

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		long[] listx = new long[N];
		long[] listy = new long [N];

		long negtate = 0;
		long postate = 0;
		long negyoko = 0;
		long posyoko = 0;

		for (int index=0; index<N; index++) {
			long x = sc.nextInt();
			long y = sc.nextInt();

			listx [index] = x;
			listy [index] = y;

			if (x>0) {
				posyoko += x;
			} else {
				negyoko += x;
			}

			if (y>0) {
				postate += y;
			} else {
				negtate += y;
			}
		}
		boolean x = true;
		boolean y = true;

		if (posyoko<Math.abs(negyoko)) {
			x = false;
		}
		if (postate<Math.abs(negtate)) {
			y = false;
		}

		for (int index=0; index<N; index++) {
			if (x&&y) {
				first (listx,listy,index);
				// x=y=true;
			} else if (!x&&y) {
				//x=flase, y=true;
				second (listx,listy,index);
			} else if (x&&!y) {
				//x=true; y=false;
				third (listx,listy,index);
			} else {
				// x=y=false;
				fourth (listx,listy,index);
			}
		}
		double num = Math.sqrt(Math.pow(yoko,2)+Math.pow(tate,2));

		System.out.println(num);
	}

	private static void fourth(long[] listx, long[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]+listy[index]<0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void third(long[] listx, long[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]*-1+listy[index]>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void second(long[] listx, long[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]+listy[index]*-1>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void first(long[] listx, long[] listy,int index) {

		if (listx[index]+listy[index]>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}
}