import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			a[i] = scan.nextInt();
		}
		int xmax1 = 0;
		int xmax2 = 0;
		int ymax1 = 0;
		int ymax2 = 0;
		int answ = w;
		int ansh = h;
		for (int i = 0; i < n; i++) {
			switch (a[i]) {
			case 1:
				if (x[i] > xmax1) {
					answ = answ - (x[i]-xmax1);
					xmax1 = x[i];					
				}
				break;
			case 2:
				if (w-x[i] > xmax2) {					
					answ = answ - (w-x[i]-xmax2);
					xmax2 = w-x[i];
				}
				break;
			case 3:
				if (y[i] > ymax1) {
					ansh = ansh - (y[i]-ymax1);
					ymax1 = y[i];
				}
				break;
			case 4:
				if (h-y[i] > ymax2) {
					ansh = ansh - (h-y[i]-ymax2);
					ymax2 = h-y[i];
				}
				break;
			}
		}
		if (answ <  0 ) {
			answ = 0;
		}
		if (ansh <  0 ) {
			ansh = 0;
		}
		System.out.println(answ*ansh);
	}
}
