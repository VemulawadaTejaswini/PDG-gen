import java.util.Scanner;
 
public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		int[] RGB = new int[] {R, G, B};
		int N = in.nextInt();
		in.close();
		long count = count(N, RGB, 0);
		
		System.out.println(count);
	}
	
	public long count(int N, int[] RGB, int index) {
		if (index == 2) {
			if (N % RGB[index] == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		int count = 0;
		for (int i=0; ;i++) {
			int newN = N - RGB[index] * i;
			if (newN < 0) {
				break;
			}
			count += count(newN, RGB, index+1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
