import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		int sum = 0;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[] array2 = new int [n];
		for (int i=0;i<n;i++) 
			array2[i] = sc.nextInt();
		
		for (int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				for(int k =0;k<n;k++) {
					if(array[i][j] == array2[k]) {
						array[i][j] = 0;
					}
				}
			}
		}
		for(int i = 0;i<3;i++) {
			if(array[i][0]==array[i][1]&&array[i][1]==array[i][2]&&array[i][2]==0) {
				sum++;
			}
		}
		for(int i = 0;i<3;i++) {
			if(array[0][i]==array[1][i]&&array[1][i]==array[2][i]&&array[2][i]==0) {
				sum++;
			}
	}
		if(array[0][0]==array[1][1]&&array[1][1]==array[2][2]&&array[2][2]==0) {
			sum++;
		}
		if(array[0][2]==array[1][1]&&array[1][1]==array[2][0]&&array[2][0]==0) {
			sum++;
		}
		if(sum>=1)
			System.out.println("Yes");
		
		else
			System.out.println("No");
}
}
