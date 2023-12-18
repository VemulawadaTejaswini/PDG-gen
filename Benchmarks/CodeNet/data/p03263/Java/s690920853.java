import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int even = 0;
		int[][] A = new int[H+1][W+1];
		for(int i = 1 ; i <= H ; i++){
			for(int j = 1 ; j <= W ; j++){
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;

		int count = 0;
		ArrayList<String> list = new ArrayList<String>();

		for(int i = 1 ; i <= H ; i++){
			for(int j = 1 ; j <= W ; j++){
				if(A[i][j]%2 == 1 && count == 0){
					count++;
					x1 = i;
					y1 = j;
				}
				else if(A[i][j]%2 == 1 && count == 1){
					count++;
					x2 = i;
					y2 = j;


					for(int n = y1; n < y2 ; n++){
						int m = n+1;
						//System.out.println(x1 + " " + n + " " + x1 + " " + m);
						list.add(x1 + " " + n + " " + x1 + " " + m);
					}
					for(int n = x1; n < x2 ; n++){
						int m = n+1;
						//System.out.println(n + " " + y2 + " " + m + " " + y2);
						list.add(n + " " + y2 + " " + m + " " + y2);
					}
					count = 0;
					x1 = 0;
					y1 = 0;
					x2 = 0;
					y2 = 0;
				}
			}
		}

		System.out.println(list.size());
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}

	}
}