

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (Integer.parseInt(sc.next()));
		int i;
		for(i = 0; i < n; i++) {
			double x1 = (Double.parseDouble(sc.next()));
			double y1 = (Double.parseDouble(sc.next()));
			double x2 = (Double.parseDouble(sc.next()));
			double y2 = (Double.parseDouble(sc.next()));
			double x3 = (Double.parseDouble(sc.next()));
			double y3 = (Double.parseDouble(sc.next()));
			double x4 = (Double.parseDouble(sc.next()));
			double y4 = (Double.parseDouble(sc.next()));
			double a1 = ((y2 - y1) / (x2 - x1)) * 100000;
			double a2 = ((y4 - y3) / (x4 - x3)) * 100000;
			if((int)a1 == (int)a2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}

