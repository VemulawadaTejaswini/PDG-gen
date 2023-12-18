import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();

			//int[][]dp = new int[N][M];

			ArrayList<Integer> are = enum_div(M);

			int max = 0;
			for(Integer i:are) {
				int wari = M/i;
				if(wari>=N) {
					max = i;
				}
			}


			System.out.println(max);
		}


	}

	private static ArrayList<Integer> enum_div(int n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 1;i*i<=n;i++) {
			if(n%i==0) {
				ret.add(i);
				if(i*i!=n){
					ret.add(n/i);
				}
			}
		}

		//ただここまでだと格納した約数はソートされてない

		Collections.sort(ret);//int型、Sting型くらいの格納した奴ならコレクションクラスのソートが使える。
		//ソートしてからcollections.reverseつかえば降順にもできる
		return ret;



	}

}
