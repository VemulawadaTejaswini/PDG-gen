import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int move = 0;
		if((a+w)<b) {
			//System.out.println(b);
			//System.out.println(a+w);
			move = b-(a+w);
		} else if((b+w)<a) {
			move = a-(b+w);
		}else {
			move =0;
		}
		System.out.println(move);
}
}
