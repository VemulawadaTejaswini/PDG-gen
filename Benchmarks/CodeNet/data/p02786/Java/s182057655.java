import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long total = 0;
		int count = 0;
		if(h == 1) {
			System.out.println(1);
			return;
		}
		while(h > 0) {
			h /= 2;
			total += Math.pow(2,count);
			count++;
		}
		if(h % 2 == 1) {
			System.out.println(total + 2);
		}else {
			System.out.println(total);
		}

	}

}
