import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gyou = Integer.parseInt(sc.next());
		int retu = Integer.parseInt(sc.next());
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int[][] i = new int[retu][gyou];
		
		for(int j = 0; j < retu; j++) {
			for(int k = 0; k < h ; k++) {
				i[j][k] = 1;
				i[j][k] = 1;
				i[j][k] = 1;
			}
		}
		
		for(int j = 0; j < gyou; j++) {
			for(int k = 0; k < w ; k++) {
				i[k][j] = 1;
				i[k][j] = 1;
				i[k][j] = 1;
			}
		}
		
		int count = 0;
		
		for(int j = 0; j < gyou; j++) {
			for(int k = 0; k < retu; k++) {
				if(i[k][j] == 1) {
					count++;
				}
			}
		}
		System.out.println((gyou * retu) - count);
	}
}