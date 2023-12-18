

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long x = sc.nextLong();

		String burger = "P";

		len = new long[51];
		len[0] = 1;

		numOfPate = new long[51];
		numOfPate[0] = 1;
		for(int i = 1; i <= 50; i++){
			len[i] = 2*len[i - 1] + 3;
			numOfPate[i] = 2*numOfPate[i - 1] + 1;
		}

//		for(int i = 1; i <= 5; i++){
//			System.out.println("Lebel "+i + " length "+ len[i]+ " pate "+numOfPate[i]);
//
//			burger = "B" + burger + "P" + burger + "B";
//
//			System.out.println(burger);
//		}

		System.out.println(solve(n, x));
	}

	static long len[];
	static long numOfPate[];

	//endを食べた層の直後のindexとする
	static long solve(int level, long end){
		long mid = len[level]/2;

		if(end <= level ){
			return 0;
		}

		if(end >= len[level] - level){
			return numOfPate[level];
		}

		//左半分の区間
		long result = solve(level - 1, end - 1);

		//センター分加算
		if(end > mid){
			result++;

			//右半分加算
			result += solve(level - 1, end - mid - 1);
		}

		return result;
	}

}
