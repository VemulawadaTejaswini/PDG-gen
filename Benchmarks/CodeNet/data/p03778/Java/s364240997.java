import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a + W < b)
			System.out.println(b - (a + W));
		if(a + W >= b)
			System.out.println(0);

	}

}