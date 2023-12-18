import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[N];
		int[] Pm = new int[M];
		int[] Ym = new int[M];

		List<ArrayList<Integer>> list = new ArrayList<>();

		for(int i=0;i<N;i++) {
			list.add(new ArrayList<>());
		}

		for(int i=0;i<M;i++) {
			Pm[i] = sc.nextInt();
			Ym[i] = sc.nextInt();
			P[(Pm[i]-1)] ++;
			list.get(Pm[i]-1).add(Ym[i]);
		}
		for(int i=0;i<list.size();i++) {
			Collections.sort(list.get(i));
		}

		for(int i=0;i<M;i++) {
			// Listを宣言し、valuesメソッドを使用してMapの値を取得する
			System.out.printf("%06d%06d%n",Pm[i],list.get(Pm[i]-1).indexOf(Ym[i]) + 1);
		}

		sc.close();
	}



}
