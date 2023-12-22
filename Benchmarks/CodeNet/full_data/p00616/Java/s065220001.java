import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			if ((n | h) == 0)
				break;
			int xy_x[] = new int[n + 1];
			int xy_y[] = new int[n + 1];
			int xz_x[] = new int[n + 1];
			int xz_z[] = new int[n + 1];
			int yz_y[] = new int[n + 1];
			int yz_z[] = new int[n + 1];
			for (int i = 0; i < h; i++) {
				String tmp = sc.next();
				if (tmp.equals("xy")) {
					xy_x[sc.nextInt()]++;
					xy_y[sc.nextInt()]++;
				} else if (tmp.equals("yz")) {
					yz_y[sc.nextInt()]++;
					yz_z[sc.nextInt()]++;
				} else if (tmp.equals("xz")) {
					xy_x[sc.nextInt()]++;
					xz_z[sc.nextInt()]++;
				}
			}
			int sum=n*n*n-n*h;
			for(int i=1;i<=n;i++){
				int x_min=Math.min(xy_x[i],xz_x[i]);
				int y_min=Math.min(xy_y[i],yz_y[i]);
				int z_min = Math.min(xz_z[i], yz_z[i]);
				sum=sum+x_min+y_min+z_min;
			}
			System.out.println(sum);
		}
	}
}