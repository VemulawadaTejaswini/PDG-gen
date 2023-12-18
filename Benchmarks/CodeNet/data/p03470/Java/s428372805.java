import java.util.*;

public class Main {

	public static void main(String[] args) {

		//フィールド
		int n = 0;
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
		//リスト作成
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			intList.add(x);
		}

		//入れ替え
		for(int i = 0; i < intList.size() ; i++) {
			for(int j = intList.size() - 1 ; j > i; j--) {
				if(intList.get(j).equals(intList.get(j-1))) {
					intList.remove(j);
				}
			}
		}
		System.out.println(intList.size());
	}
}
