import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
	  //すぬけ君の人数
		int N=sc.nextInt();

		//お菓子の種類数
		int K=sc.nextInt();

		ArrayList<Integer>array=new ArrayList<>();

		//お菓子の種類分繰り返し
		for(int i=0;i<K;i++) {
			//そのお菓子を持っている人数
			int	d=sc.nextInt();

			//そのお菓子を持っている人の名前の入力繰り返し
			for(int j=0;j<d;j++) {
				int checkint=sc.nextInt();
				if(!array.contains(checkint)) {
					//そのお菓子をもっている人の名前を配列に格納
					array.add(checkint);
				}
			}


		}
		System.out.println(N-array.size());

	}
}
