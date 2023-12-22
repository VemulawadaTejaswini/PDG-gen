import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int colors[][] = {
				{0,   0,   0},
				{0,   0,   255},
				{0,   255,   0},
				{0,   255,   255},
				{255,   0,   0},
				{255,   0,   255},
				{255,   255,   0},
				{255,   255,   255},
		};
		String[] names = 
			{
				"black" , "blue" , "lime" , "aqua" , "red" , "fuchsia" , "yellow" , "white"
			};
		
		while (true) {
			String str = sc.next();

			if("0".equals(str)){
				break;
			}
			
			int r = Integer.parseInt(str.substring(1, 3), 16);
			int g = Integer.parseInt(str.substring(3, 5), 16);
			int b = Integer.parseInt(str.substring(5, 7), 16);
			
			double min = Integer.MAX_VALUE;
			int min_num = -1;
			for(int i = 0; i < 8; i++){
				double d = Math.sqrt((colors[i][0] - r)*(colors[i][0] - r) + (colors[i][1] - g)*(colors[i][1] - g) + (colors[i][2] - b)*(colors[i][2] - b));
				if(min > d){
					min = d;
					min_num = i;
				}
			}
			
			System.out.println(names[min_num]);
		}

	}
}