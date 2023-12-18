import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		if(h +w == 1){
			System.out.println("No");
			return;
		}
		int[][] array = new int[h+2][w+2];
		for(int i = 0; i < h+2;i++) for(int j = 0; j < w+2;j++) array[i][j] = 0;
		for(int i = 1; i < h; i++){
			String s = sc.next();
			for(int j = 1; j < w; j++){
				array[i][j] = s.charAt(j) == '#' ? 1 : 0;
			}
		}
		for(int i = 1; i < h; i++){
			for(int j = 1; j < w; j++){
				if(array[i][j] == 0) continue;
				int sum = 0;
				sum += array[i-1][j];
				sum += array[i+1][j];
				sum += array[i][j-1];
				sum += array[i][j+1];
				if(sum == 0){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
		return;
	}
}