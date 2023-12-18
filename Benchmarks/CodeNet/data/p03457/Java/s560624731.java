import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		
		for(int i = 1; i <= N; i++) {
			String s = sc.nextLine();
			t[i] = Integer.parseInt(s.substring(0,1));
			x[i] = Integer.parseInt(s.substring(2,3));
			y[i] = Integer.parseInt(s.substring(4,5));
		}
		sc.close();
		
		for(int i = 0; i < N; i++) {
			int absT = t[i+1] - t[i];
			int absX = Math.abs((x[i+1] - x[i]));
			int absY = Math.abs((y[i+1] - y[i]));
			if( absT < absX + absY || absT % 2 != (absX + absY) % 2 ) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}