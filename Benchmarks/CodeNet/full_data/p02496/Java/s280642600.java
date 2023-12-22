import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][13];
		int n, rank;
		String mark;
		n = sc.nextInt();
		if(n <= 52) {
			// 入力処理
			for(int i=0; i<n; i++) {
				mark = sc.next();
				rank = sc.nextInt();
				if(mark.equals('S')) {
					arr[0][rank-1] = 1;
				} else if(mark.equals('H')) {
					arr[1][rank-1] = 1;
				} else if(mark.equals('C')) {
					arr[2][rank-1] = 1;
				} else if(mark.equals('D')) {
					arr[3][rank-1] = 1;
				}
			} // 入力処理ここまで
			
			// 出力処理
			for(int i=0; i<4; i++) {
				for(int j=0; j<13; j++) {
					if(arr[i][j] == 0) {
						if(i == 0 && arr[i][j] == 0) {
							System.out.println("S "+(j+1));
						} else if(i == 1 && arr[i][j] == 0) {
							System.out.println("H "+(j+1));
						} else if(i == 2 && arr[i][j] == 0) {
							System.out.println("C "+(j+1));
						} else if(i == 3 && arr[i][j] == 0) {
							System.out.println("D "+(j+1));
						}
					}
				}
			}
		}
	}
}