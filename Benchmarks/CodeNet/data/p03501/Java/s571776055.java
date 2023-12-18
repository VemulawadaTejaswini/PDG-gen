import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int firstStr = Integer.parseInt(sc.next());
		int secondStr = Integer.parseInt(sc.next());
		int thirdStr = Integer.parseInt(sc.next());
		sc.close();
		
		
		System.out.println(firstStr * secondStr > thirdStr ? thirdStr: firstStr * secondStr);
	}
}