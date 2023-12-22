import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataSetNumber = scan.nextInt();
		int[][] triangle = new int[dataSetNumber][3];

		for(int i = 0; i < dataSetNumber; i++){
			scan = new Scanner(System.in);
			for(int j = 0; j < 3; j++){
				triangle[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < dataSetNumber; i++){
			java.util.Arrays.sort(triangle[i]);
			int a = triangle[i][0] * triangle[i][0];
			int b = triangle[i][1] * triangle[i][1];
			int c = triangle[i][2] * triangle[i][2];
			if(a + b == c){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}