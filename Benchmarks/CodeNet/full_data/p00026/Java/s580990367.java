import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\\r\\n|,");
		int[] area = new int[10*10];

		while (scan.hasNextInt()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int size = scan.nextInt();
			
			int point = y * 10 + x;
			
			switch (size) {
			case 3:
				if(x < 8) area[point + 2]++;
				if(x > 1) area[point - 2]++;
				if(y < 8) area[point + 20]++;
				if(y > 1) area[point - 20]++;
			case 2:
				//左上
				if(x > 0 && y > 0) area[point - 11]++;
				//右上
				if(x < 9 && y > 0) area[point - 9]++;
				//左下
				if(y < 9 && x > 0) area[point + 9]++;
				//右下
				if(y < 9 && x < 9) area[point + 11]++;
			case 1:
				if(x < 9) area[point + 1]++;
				if(x > 0) area[point - 1]++;
				if(y < 9) area[point + 10]++;
				if(y > 1) area[point - 10]++;
				area[point]++;
			}
		}

		Arrays.sort(area);
		int blank = 0;
		for(int i = 0; i < 100; i++ ){
			if(area[i] != 0) {
				blank = i;
				break;
			}
		}
		
		//System.out.println(Arrays.binarySearch(area, 1));
		System.out.println(blank);
		System.out.println(area[99]);
	}
}