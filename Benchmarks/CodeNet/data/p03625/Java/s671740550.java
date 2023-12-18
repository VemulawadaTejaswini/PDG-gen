import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		int count1 = 1;
		int count2 = 0;
		int width = array[array.length - 1];
		int height = 0;
		boolean widthFixed = false;
		boolean heightFixed = false;
		for (int i = array.length - 2; i >= 0; i--) {
			if (!widthFixed) {
				if (array[i] == width) {
					count1++;
					if (count1 == 4) {
						height = width;
						widthFixed = true;
						heightFixed = true;
						break;
					}
				} else {
					if (count1 < 4 && count1 >= 2) {
						count1 = 2;
						widthFixed = true;
						height = array[i];
						count2 = 1;
					} else {
						count1 = 1;
						width = array[i];
					}
				}
			} else {
				if (array[i] == height) {
					count2++;
					if (count2 == 2) {
						heightFixed = true;
						break;
					}
				} else {
					if (count2 < 2) {
						height = array[i];
						count2 = 1;
					}
				}
			}
		}
		if (heightFixed && widthFixed) {
			System.out.println(width * height);
		} else {
			System.out.println("0");
		}
		
	}
}