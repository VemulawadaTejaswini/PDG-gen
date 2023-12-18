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
				long mh = Long.MAX_VALUE/3;
				for(int k=0;k<n;k++) {
					int dx = Math.abs(cx - x[k]);
					int dy = Math.abs(cy - y[k]);						
					if(h[k]!=0) {
						ch = (long)h[k] + dx + dy;
						break;
					}
					mh = Math.min(mh,(long)h[k] + dx + dy );
				}
				if(ch == -1) {
					ch = mh;
				}
				
				for(int k=0;k<n;k++) {
					int dx = Math.abs(cx - x[k]);
					int dy = Math.abs(cy - y[k]);
					if(h[k]==0) {
						if(dx + dy < ch) {
							ch = -1;
							break;
						}
					}
					if(ch != (long)h[k] + dx + dy) {
						ch = -1;
						break;
					}
				}

				
				if(ch!=0&&ch!=-1) {
					System.out.println(cx + " " + cy + " " + ch);
					return;
				}
			}
		}
	}
}
