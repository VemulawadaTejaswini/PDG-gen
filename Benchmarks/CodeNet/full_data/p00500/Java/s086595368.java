import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[][] count = new int[N][100];
		int[][] data = new int[N][3];
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 3; j++){
				data[i][j] = sc.nextInt() - 1;
				count[j][data[i][j]]++;
			}
		}
		
		for(int i = 0; i < N; i++){
			int sum = 0;
			for(int j = 0; j < 3; j++){
				if(count[j][data[i][j]] <= 1){
					sum += data[i][j] + 1;
				}
			}
			
			System.out.println(sum);
		}
		
	}

}