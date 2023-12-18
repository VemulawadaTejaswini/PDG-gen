import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		
		int[] w = new int[W];
		int[] h = new int[H];
		
		for (int i = 0; i < w.length; i++) {
			w[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < h.length; i++) {
			h[i] = scanner.nextInt();
		}
		
		int cost = 0;
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if (i == 0 && j == 0) {
					cost += Math.max(h[0], w[0]) +  Math.min(h[0], w[0]) * 2;
				} else if (i == 0) {
					if (w[0] < h[j]) {
						cost += w[0] + h[j];
					} else {
						cost += h[j] * 2; 
					}
				} else if (j == 0) {
					if (w[i] < h[0]) {
						cost += w[i] * 2;
					} else {
						cost += w[i] + h[0];
					}
				} else {
					cost += Math.min(w[i], h[j]);
				}
//				System.out.println(cost);
			}
		}
		
		System.out.println(cost);
		
		
	}

}