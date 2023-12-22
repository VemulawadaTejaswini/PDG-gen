import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		int a, b;
		
		while (date.hasNext()) {
			a = date.nextInt();
			b = date.nextInt();
			int sum = a + b;
			System.out.println(String.valueOf(sum).length());
			System.out.println();
		}
		
	
	}

}