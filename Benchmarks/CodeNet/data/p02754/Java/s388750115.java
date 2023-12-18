import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//入力の読み込み
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();
		int balls[] = new int[num];

		//
		int countBlue = 0;
		while(balls[num-1] == 0) {
			for(int i= 0 ; i>red ; i++) {
				balls[i] = 1;
			}
			for(int i=red ; i>red+blue ; i++) {
				balls[i] = 2;
				countBlue++;
			}
		}
		System.out.print(countBlue);
		sc.close();
	}
}
