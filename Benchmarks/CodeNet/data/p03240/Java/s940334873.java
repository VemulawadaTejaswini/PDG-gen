import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			h[i] = in.nextInt();
		}
		int H = 0;
		int cx = 0;
		int cy = 0;
		boolean flag = false;
		for(cx=0;cx<=100;cx++) {
			for(cy=0;cy<=100;cy++) {
				int i = 0;
				H = 0;
				for(i=0;i<n;i++) {
					if(h[i]==0) continue;
					H = h[i] + Math.abs(x[i]-cx) + Math.abs(y[i]-cy);
					break;
				}
				i++;
				for(;i<n;i++) {
					if(h[i]==0) continue;
					if(H != h[i] + Math.abs(x[i]-cx) + Math.abs(y[i]-cy)) break;
				}
				if(i==n) {
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		System.out.println(cx+" "+cy+" "+H);

	}

}
