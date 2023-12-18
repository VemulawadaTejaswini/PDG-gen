import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int setLength = scanner.nextInt();
		int[] times = new int[setLength];
		int[] xs = new int[setLength];
		int[] ys = new int[setLength];
		for (int i = 0; i < setLength; i++) {
			times[i] = scanner.nextInt();
			xs[i] = scanner.nextInt();
			ys[i] = scanner.nextInt();		
		}
		int x = 0;
		int y = 0;
		int num = 0;
		boolean success = false;
		
		for (int time = 0; time <= times[setLength-1]; time++) {
			if(time > times[num]) {
				success =false;
				break;
			}
			if(x==xs[num] && y==ys[num]) {
				if(time == times[num]) {
					if(num < setLength-1) {
						num++;
					} else {
						success = true;
						break;
					}
				}
				
			}
			if(Math.abs(x-xs[num]) != 0) {
				if(x<xs[num]) {
					x++;
				} else {
					x--;
				}
			} else if(Math.abs(y-ys[num]) != 0) {
				if(y<ys[num]) {
					y++;
				} else {
					y--;
				}
			} else {
				x++;
			}
		}
		if (success) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
