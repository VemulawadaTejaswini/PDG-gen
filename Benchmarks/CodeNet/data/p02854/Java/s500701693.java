import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] bar = new int[N];
		
		
		int money = 0;
		int res1 = 0;
		int res2 = 0;
		
		for(int i = 0;i < N;i++) {
			bar[i] = sc.nextInt();
		}
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0;i < N;i++) {
			res1 += bar[i];

			for(int j = i+1;j < N; j++) {
				res2 = 0;
				res2 += bar[j];
			}
			if(res1 == res2) {
				System.out.println(money);
			}else {
				a.add(Math.abs(res1 - res2));

			}
		}
		int min = Min(a);
		System.out.println(min-1);

	}
	public static int Min(ArrayList<Integer> array) {
		int min = array.get(0);
		
		for(int i = 1; i< array.size();i++) {
			if(array.get(i) < min) {
				min = array.get(i);
			}
		}
		return min;
	}

}