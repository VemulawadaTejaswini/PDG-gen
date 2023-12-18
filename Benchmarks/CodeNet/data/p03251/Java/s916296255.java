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
		int xmax = x;
		int ymin = y;
		for(int i=0; i<n; i++) {
			xdata[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			ydata[i]=sc.nextInt();
		}
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
		if(xmax<ymin) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}
	}
}