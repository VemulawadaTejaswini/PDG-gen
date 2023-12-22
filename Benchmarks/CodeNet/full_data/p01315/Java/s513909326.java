import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int n = sc.nextInt();

			if(n==0) {
				break;
			}

			Plant[] array = new Plant[n];

			for(int i = 0; i < n; i++) {
				String name = sc.next();
				int seedPrice = sc.nextInt();
				int hatsuga = sc.nextInt();
				int wakaba = sc.nextInt();
				int leaf = sc.nextInt();
				int bloom = sc.nextInt();
				int makeFruit = sc.nextInt();
				int FruitNum = sc.nextInt();
				int fruitPrice = sc.nextInt();
				int kisaku = sc.nextInt();

				array[i] = new Plant(name, seedPrice, hatsuga, wakaba, leaf, bloom, makeFruit, FruitNum, fruitPrice, kisaku);
			}

			Arrays.sort(array);
			for(Plant plant :array) {
			System.out.println(plant.name);
			}
			System.out.println("#");
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


class Plant implements Comparable<Plant>{
	String name;
	double efficiency;

	Plant(String name, int seedPrice, int hatsuga, int wakaba, int leaf, int bloom, int makeFruit, int fruitNum, int fruitPrice, int kisaku){
		this.name = name;
		int sumTime = hatsuga + wakaba + leaf +( bloom + makeFruit) *kisaku;
		this.efficiency = (double)(fruitNum*kisaku*fruitPrice-seedPrice)/sumTime;
	}

	@Override
	public int compareTo(Plant other) {
		if(this.efficiency > other.efficiency) {
			return -1;
		}else if(this.efficiency < other.efficiency){
			return 1;
		}else {
			return this.name.compareTo(other.name);
		}
	}


}

