import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> numList = new ArrayList<Integer>();
		List<Integer> ansList = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			numList.add(i + 1);
		}
	}

	public static void permutation(List<Integer> array, List<Integer> ans) {

		if(ans.size() == 0) {
			for(int i = 0; i < array.size(); i++) {
				if(i != 0) System.out.print(" ");
				System.out.print(ans.get(i));
			}
			System.out.println();
		}
		else {
			for(int i = 0; i < array.size(); i++) {
				ans.add(array.remove(i));
				permutation(array, ans);
			}
		}
	}
}

