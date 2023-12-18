
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean dislike[] = new boolean[10];
		
		for(int i = 0; i < k; i++) {
			dislike[sc.nextInt()] = true;
		}
		
		for(int i = n; ; i++) {
			String numStr = Integer.toString(i);
			boolean good = true;
			
			for(int j = 0; j < 10; j++) {
				if(dislike[j] && numStr.contains(Integer.toString(j))) {
					good = false;
					break;
				}
			}
			
			if(good) {
				System.out.println(i);
				return;
			}
		}
	}		
}
