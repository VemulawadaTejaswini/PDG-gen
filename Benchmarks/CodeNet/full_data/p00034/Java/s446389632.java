import java.util.Scanner;

public class Main {
	private int[] a = new int[10];
	private double v1, v2;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] str = scan.nextLine().split(",");
			
			int dis = 0;
			
			for (int i = 0; i < 10; i++) {
				a[i] = Integer.parseInt(str[i]); 
				dis += a[i];
			}
			
			v1 = Double.parseDouble(str[10]);
			v2 = Double.parseDouble(str[11]);
			
			double pos = v1 * dis / (v1 + v2);
			//System.out.println(pos);
			
			int cal = 0, ans = 0;
			for (int i = 0; i < 10; i++) {
				if (cal + a[i] >= pos) {
					ans = i+1;
					break;
				}
				cal += a[i];
			}
			
			System.out.println(ans);
			
		}
	}
	
	private void debug() {
		System.out.println();
	}

}