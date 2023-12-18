import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int cx,cy,h;
		int inputCount = Integer.parseInt(scan.nextLine());

		for(int i=0; i<inputCount; i++) {
			String r = scan.nextLine();
			int xi = Integer.parseInt(r.substring(0, r.indexOf(" ")));
			int yi = Integer.parseInt(r.substring(r.indexOf(" ")+1, r.lastIndexOf(" ")));
			int hi = Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1));
			// Hi = max(H−|Xi−CX|−|Yi−CY|,0)
			// H>0
			// |X-CX| = -|Y-CY|
			for(cx=0; cx<=100; cx++) {
				for(cy=0; cy<=100; cy++) {
					h = (hi + Math.abs(cx-xi) + Math.abs(cy-yi));
					if(hi == (h - Math.abs(xi-cx) - Math.abs(yi-cy))) {
						System.out.println(cx + " " + cy + " " + h);
						return;
					}
				}
			}
		}
	}
}