import java.util.Scanner;

public class Main {
	public static int point;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int q = stdIn.nextInt();
		
		String[] queue1 = new String[n];
		int[] queue2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			queue1[i] = stdIn.next();
			queue2[i] = stdIn.nextInt();
		}
		
		point = n - 1;
		int time = 0;
		while (point >= 0) {
			if (queue2[0] <= q) {
				time += queue2[0];
				System.out.println(queue1[0] +" "+time);
				for (int i = 1; i <= point; i++){
					queue1[i-1] = queue1[i];
					queue2[i-1] = queue2[i];
				}
				point--;
			}
			else {
				time += q;
				queue2[0] -= q;
				String t1 = queue1[0];
				int t2 = queue2[0];
				int i;
				for (i = 1; i <= point; i++) {
					queue1[i-1] = queue1[i];
					queue2[i-1] = queue2[i];
				}
				queue1[i-1] = t1;
				queue2[i-1] = t2;
			}
		}
	}
}