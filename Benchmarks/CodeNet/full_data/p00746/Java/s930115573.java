import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static Square[] squares;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int N = sc.nextInt();

			if(N==0) {
				break;
			}

			squares = new Square[N];
			squares[0] = new Square();
			int maxHeight = 0;
			int minHeight=0;
			int maxWidth = 0;
			int minWidth = 0;


			for(int i = 1; i < N; i++) {
				int preNum = sc.nextInt();
				int dir = sc.nextInt();

				squares[i] = new Square(squares[preNum], dir);

				if(squares[i].height > maxHeight) {
					maxHeight = squares[i].height;
				}
				if(squares[i].height < minHeight){
					minHeight =  squares[i].height;
				}
				if(squares[i].width > maxWidth) {
					maxWidth = squares[i].width;
				}
				if(squares[i].width < minWidth){
					minWidth =  squares[i].width;
				}
			}
			System.out.println((maxWidth - minWidth +1)+" "+(maxHeight - minHeight+1));
		}
	}

	//BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}
}

class Square{
	int height;
	int width;
	public Square() {
		this.height = 0;
		this.width = 0;
	}
	Square(Square pre, int direction){
		if(direction == 0 ) {
			this.height = pre.height;
			this.width = pre.width -1;
		}else if(direction == 1) {
			this.height = pre.height-1;
			this.width = pre.width;
		} else if(direction == 2) {
			this.height = pre.height;
			this.width = pre.width +1;
		} else {
			this.height = pre.height +1;
			this.width = pre.width;
		}
	}

}

