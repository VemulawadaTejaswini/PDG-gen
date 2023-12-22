import java.util.Scanner;

public class Main{
	public static void time(int[] h, int[] m, int[] s){
		int hour = h[1]-h[0];
		int minute = m[1]-m[0];
		int second = s[1]-s[0];
		if( second < 0 ){
			second += 60;
			minute--;
		}
		if( minute < 0 ){
			minute += 60;
			hour--;
		}
		
		System.out.println(hour + " " + minute + " " + second);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[][] h = new int[3][2];
		int[][] m = new int[3][2];
		int[][] s = new int[3][2];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				h[i][j] = stdIn.nextInt();
				m[i][j] = stdIn.nextInt();
				s[i][j] = stdIn.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++){
			time(h[i], m[i], s[i]);
		}
	}
}