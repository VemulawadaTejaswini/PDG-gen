import java.util.*;

public class Main {
	private Stack<Integer> stackA, stackB, stackC;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while (n-- > 0) {
			int[] ball = new int[10];
			for (int i = 0; i < 10; i++) {
				ball[i] = scan.nextInt();
			}
			
			stackA = new Stack<Integer>();
			stackB = new Stack<Integer>();
			stackC = new Stack<Integer>();
			stackB.push(0); stackC.push(0);
			
			for (int i = 9; i >= 0; i--) stackA.push(ball[i]);
			
			boolean flag = true;
			
			for (int i = 0; i < 10; i++) {
				int num = stackA.pop();
				int B = stackB.peek();
				int C = stackC.peek();
				if (num > B || num > C) {
					if (num < B) {
						stackC.push(num);
					}else if (num < C) {
						stackB.push(num);
					}else {
						if (B > C) {
							stackB.push(num);
						}else {
							stackC.push(num);
						}
					}
				}else {
					flag = false;
					break;
				}
			}
			System.out.println(flag?"YES":"NO");
		}
	}
	
	private void debug() {
		System.out.println();
	}
}