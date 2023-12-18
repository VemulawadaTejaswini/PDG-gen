import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] xdata = new int[n];
		int m = sc.nextInt();
		int[] ydata = new int[m];
		int x = sc.nextInt();
		int y = sc.nextInt();

		for(int i=0; i<n; i++) {
			xdata[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			ydata[i]=sc.nextInt();
		}
		int xmax = xdata[0];
		int ymin = ydata[0];
		
		for(int i=0; i<n; i++) {
			if(xmax<xdata[i]) {
				xmax = xdata[i];
			}
		}
		for(int i=0; i<m; i++) {
			if(ymin>ydata[i]) {
				ymin = ydata[i];
			}
		}
		boolean war = true;
		if(xmax<ymin) {
			for(int i=xmax; i<ymin; i++) {
				if(x<i && i<=y) {
					war = false;
					break;
				}
			}
		}
		if(war) {
			System.out.println("War");
		}else {
			System.out.println("No War");
		}
	}
}