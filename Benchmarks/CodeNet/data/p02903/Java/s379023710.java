
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int [][]map = new int [h][w];
		
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ;j < w ; j++) {
				if(i < b && j < a) {
					map[i][j] = 1;
				}
				else if(i >= b && j >= a) {
					map[i][j] = 1;
				}
				else {
					map[i][j] = 0;
				}
			}
		}
		
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}		
}
