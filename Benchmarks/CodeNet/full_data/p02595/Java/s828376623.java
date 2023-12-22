import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int[][] point = new int[N][2];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				point[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			if(Math.sqrt(point[i][0]+point[i][1])<=D) {
				count += 1;
			}
		}
		
		System.out.println(count);

	}

}
