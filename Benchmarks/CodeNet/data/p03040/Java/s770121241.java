
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int query = sc.nextInt();
		Calc lower = new Calc(query/2+1);
		Calc upper = new Calc(query/2+1);
		long bSum = 0;
		StringBuilder sb = new StringBuilder();
		sc.next();
		int middle = sc.nextInt();
		bSum += sc.nextLong();
		for(int i=1;i<query;i++) {
			int order = sc.nextInt();
			if(order == 1) {
				int addA = sc.nextInt();
				bSum += sc.nextLong();
				if(addA < middle) {
					if(lower.arr[0] == upper.arr[0]) {
						//middleの繰り下げ
						upper.add(middle);
						lower.add(addA*-1);
						middle = -1*lower.arr[1];
						lower.removeMin();
					}else {
						lower.add(addA*-1);
					}
				}else {
					if(lower.arr[0] < upper.arr[0]) {
						//middleの繰り上げ
						lower.add(middle*-1);
						upper.add(addA);
						middle = upper.arr[1];
						upper.removeMin();
					}else {
						upper.add(addA);
					}
				}
			}else {
				long atotal = 0;
				int length = lower.arr[0];
				for(int j=1;j<=length;j++)
					atotal += lower.arr[j];
				length = upper.arr[0];
				for(int j=1;j<=length;j++)
					atotal += upper.arr[j];
				atotal -= (length - lower.arr[0])*middle;
				sb.append(middle).append(' ').append(atotal+bSum).append('\n');
			}
		}
		sc.close();
		System.out.println(sb.toString());
	}
}

class Calc {

	int arr[];

	Calc(int length){
		arr = new int[length];
	}

	/*
	 * ヒープソート(最小または最大要素のみを参照できる配列)
	 * index 0 = 要素数
	 * index 1 = 参照要素
	 * 要素数より大きいindexにも値が入っている可能性がある
	 */

	//最小ヒープソートへの追加
	void add(int x) {
		int length = arr[0];
		int point = length + 1;
		for(point = length+1;point>1;point /= 2) {
			if(arr[point/2] > x)
				arr[point] = arr[point/2];
			else {
				arr[point] = x;
				break;
			}
		}
		if(point == 1)
			arr[1] = x;
		arr[0]++;
	}

	//最小ヒープソートから最小値を取り出す(参照配列に変化なし)
	int min() {
		return arr[1];
	}

	//最小ヒープソートから最小値を除く(参照配列は最小値を除く配列になる)
	void removeMin() {
		int x = arr[arr[0]];
		arr[0]--;
		int point = 1;
		while(point<=(arr[0])/2) {
			int child = arr[point*2] < arr[point*2+1] ? point*2 : point*2+1;
			if(arr[child] < x)
				arr[point] = arr[child];
			else {
				arr[point] = x;
				break;
			}
			point = child;
		}
		if(point*2 > arr[0])
			arr[point] = x;
	}


	/*
	 * root部分の要素を適切な位置におろす作業
	 */
	void downHeap() {
		int x = arr[1];
		int point = 1;
		int length = arr[0];
		while(point<=(length)/2) {
			int child = point*2+1 <= length && arr[point*2] > arr[point*2+1]? point*2+1:point*2;
			if(arr[child] < x)
				arr[point] = arr[child];
			else {
				arr[point] = x;
				break;
			}
			point = child;
		}
		if(point*2 > arr[0])
			arr[point] = x;
	}
}