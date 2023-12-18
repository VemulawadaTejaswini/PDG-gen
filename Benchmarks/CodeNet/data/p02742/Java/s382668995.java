import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		long h = scanner.nextLong();
		long w = scanner.nextLong();

		long result = 0;
		result = h/2 * (w/2+ w/2 + w%2);
		if(h%2 == 1){
			result += w/2 + w%2;
		}

		if(h == 1 || w == 1) result = 1;
		System.out.println(result);
	}

}
