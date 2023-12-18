import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sheet[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sheet[i][j] = sc.nextInt();
			}
		}	
		
		int N = sc.nextInt();
		for(int n = 0; n < N; n++){
			int x = sc.nextInt();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(sheet[i][j] == x)sheet[i][j] = 0;
				}
			}
		}
	}
}
