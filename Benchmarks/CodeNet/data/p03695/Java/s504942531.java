import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] rat = new int[n];
			int[] col = new int[9];
			int varmin = 0;
			int varmax = 0;
			for (int i = 0; i < n; i++) {
				rat[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				rat[i] = rat[i]/400;
				if (rat[i] >= 8) {
					rat[i] = 8;
				}
			}
			for (int i = 0; i < n; i++) {
				col[rat[i]]++;
			}
			for (int i = 0; i < 8; i++) {
				if (col[i] > 0) {
					varmin++;
				}
			}
			varmax = varmin + col[8];
			System.out.println(varmin + " " + varmax);

		    sc.close(); }
}
