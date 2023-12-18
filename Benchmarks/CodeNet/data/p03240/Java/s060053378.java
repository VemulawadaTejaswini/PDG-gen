import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int h[] = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				int cx = i, cy = j;
				long ch = -1;
				for(int k=0;k<n;k++) {
					int dx = Math.abs(cx - x[k]);
					int dy = Math.abs(cy - y[k]);						
					if(ch != -1) {
						if(ch - h[k] != dx + dy) {
							ch = -1;
							break;
						}
					}
					else {
						ch = (long)h[k] + dx + dy;
					}
				}
				if(ch!=-1) {
					System.out.println(cx + " " + cy + " " + ch);
					return;
				}
			}
		}
	}
}
