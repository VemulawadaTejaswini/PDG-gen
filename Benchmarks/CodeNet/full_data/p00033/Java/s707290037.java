import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		int n = scan.nextInt();

		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				int ballNum = scan.nextInt();
				if(0 < ballNum && ballNum < 11) {
					queue.add(ballNum);
				}
			}

			int bNum = 0,cNum = 0;

			while(queue.peekFirst() != null) {
				int ball = queue.poll();
				if(ball > bNum) {
					bNum = ball;
				}else if(ball > cNum) {
					cNum = ball;
				}else {
					System.out.println("NO");
					break;
				}
			}
			if(queue.isEmpty()) {
				System.out.println("YES");
			}
		}

	}

}
