
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] list = new String[h];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.next();
		}
		
		char[][] square = new char[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				if (i == 0 || i == h + 1) {
					square[i][j] = '#';
					continue;
				}
				
				if (j == 0 || j == w + 1) {
					square[i][j] = '#';
					continue;
				}
				
				square[i][j] = list[i - 1].charAt(j - 1);
			}
		}
		
		System.out.println();
	}
}