import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		TreeMap<Integer, Integer> studentMap = new TreeMap<>();

		//キーと値を追加する(.put())
		for (int studentNum = 1 ; studentNum <= student ; studentNum++) {
			studentMap.put(sc.nextInt(), studentNum);
		}

		//すべてのキーを取得する(.keySet())
		for (int key : studentMap.keySet()) {

			//keyを指定してvalueを取得(.get())
			System.out.print(studentMap.get(key) + " ");
		}
		sc.close();
	}
}