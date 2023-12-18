
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//下限の数取得
		int a = sc.nextInt();
		
		//上限の数取得
		int b = sc.nextInt();
		
		b = b/2;
		
		int sum = a + b;
		
		System.out.println(sum);
		
		
	}

}