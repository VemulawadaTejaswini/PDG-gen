
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++)
			list.add(sc.nextInt());
		Collections.sort(list);
		ArrayList<int[]> pairs = new ArrayList<>();
		for(int i = 0;i<N-1;i++) {
			int[] pair = new int[2];
			int x = list.get(0);
			int y = list.get(1);
			int num = x - y;
			list.remove(0);
			list.remove(0);
			list.add(num);
			Collections.sort(list);
			pair[0] = x;
			pair[1] = y;
			pairs.add(pair);
		}
		int max = list.get(0);
		System.out.println(max);
		for(int[] num:pairs) {
			System.out.println(num[0]+" "+num[1]);
		}
		sc.close();
	}

}
