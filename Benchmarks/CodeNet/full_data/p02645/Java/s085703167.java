import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);

		// 文字列入力
		String S = inData.nextLine();

		System.out.println(S.substring(0, 3));

		// input close
		inData.close();
	}
}
