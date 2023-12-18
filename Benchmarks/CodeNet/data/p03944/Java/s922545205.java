import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		int xMax = w;
		int xMin = 0;
		int yMax = h;
		int yMin = 0;
		for(int i = 0; i < n; i++) {
			switch(a[i]) {
			case 1:
				if(x[i] > xMin) xMin = x[i];
				break;
			case 2:
				if(x[i] < xMax) xMax = x[i];
				break;
			case 3:
				if(y[i] > yMin) yMin = y[i];
				break;
			case 4:
				if(y[i] < yMax) yMax = y[i];
				break;
			}
		}
		if(xMax > xMin && yMax > xMin) {
			System.out.println((xMax - xMin) * (yMax - yMin));
		} else {
			System.out.println(0);
		}
	}
}
