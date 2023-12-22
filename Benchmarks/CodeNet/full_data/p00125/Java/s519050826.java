import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int y1 = sc.nextInt();
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int y2 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			if (y1 == -1) break;
			
			Calendar cal1 = Calendar.getInstance();
			cal1.set(y1, m1 - 1, d1, 0, 0, 0);
			
			Calendar cal2 = Calendar.getInstance();
			cal2.set(y2, m2 - 1, d2, 0, 0, 0);
			long dd = (cal2.getTime().getTime() - cal1.getTime().getTime()) / (1000 * 60 * 60 * 24);
			System.out.println(dd);
		}
	}
}