import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;

		List<Integer> ab = new ArrayList<Integer>();

		for(int i=0; i<m; i++) {
			ab.add(sc.nextInt());
			ab.add(sc.nextInt());
		}

		List<Integer> abNew = new ArrayList<Integer>(new HashSet<>(ab));

		answer = n - abNew.size();

		if( m+answer < n-1) {
			answer = n-m-1;
		}
		System.out.println(answer);
	}
}