import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int count = 0;
	static int height;
	static int width;
	static ArrayList<Integer> x = new ArrayList<Integer>();
	static ArrayList<Integer> y = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		width = sc.nextInt();
		int[][] dimensional = new int[height][width];

		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				dimensional[i][j] = sc.nextInt();
			}
		}
		xyprocess();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < height*width; i++) {
			if((dimensional[x.get(i-1)-1][y.get(i-1)-1]) % 2 != 0) {
				dimensional[x.get(i)-1][y.get(i)-1] +=1;
				count++;
				list.add(i-1);
			}
		}

		System.out.println(count);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(x.get(list.get(i)) + " " + y.get(list.get(i)) + " " + x.get(list.get(i)+1) + " "+ y.get(list.get(i)+1));
		}
	}
	static void xyprocess() {
		boolean flag = true;
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				x.add(i);
			}
		}
		for(int i = 1; i <= height; i++) {
			if(flag) {
				for(int j = 1; j <= width; j++) {
					y.add(j);
				}
			}else {
				for(int j = width; j >= 1; j--) {
					y.add(j);
				}
			}
			flag = !flag;
		}
	}
}