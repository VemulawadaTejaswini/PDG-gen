import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int judge = sc.nextInt(); //整数の入力
		if (judge == 1) {
			System.out.println("Hello World");
		} else {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}