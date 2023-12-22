import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String W = sc.next();
		int count = 0;

		while(sc.hasNext()) {  //hasNextメソッドはscannerの入力に別のトークンが残っている場合trueを返す
			String T = sc.next();

			if(T.contentEquals("END_OF_TEXT")) break;

		    T = T.toLowerCase();

		    if(T.equals(W)) count++;
		}

		System.out.println(count);
	}

}

