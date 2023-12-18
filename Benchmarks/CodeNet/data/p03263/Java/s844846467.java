import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();

		int counter = 0;
		List<String> ansList = new ArrayList<>();
		int stockCount = 0;
		int currentNum = -1;
		
		int[][] hw = new int[H][W];
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				hw[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < H; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < W; j++) {
					if (i == H-1 && j == W-1) {
						break;
					}
					currentNum = hw[i][j];
					if ((currentNum + stockCount) % 2 == 1 ) {
						if (j != W - 1) {
							ansList.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
						} else {
							ansList.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
						}
						counter++;
						stockCount = 1;
						
					} else {
						stockCount = 0;
					}
				}
			} else {
				for (int j = W - 1; j >= 0; j--) {
					if (i == H-1 && j == W-1) {
						break;
					}
					currentNum = hw[i][j];
					if ((currentNum + stockCount) % 2 == 1 ) {
						if (j != 0) {
							ansList.add((i+1) + " " + (j+1) + " " + i + " " + (j-1));
						} else {
							ansList.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
						}
						counter++;
						stockCount = 1;
					} else {
						stockCount = 0;
					}
					
				}
			}
		}
		System.out.println(counter);
		for (int i = 0; i < counter; i++) {
			System.out.println(ansList.get(i));
		}
		
		
	}
}
