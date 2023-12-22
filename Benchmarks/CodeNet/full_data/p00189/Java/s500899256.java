import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 29;

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int [][] data = new int[10][10];
			for(int i =0 ; i < 10 ;i++){
				for(int j = 0; j < 10; j++){
					if(i == j){
						data[i][j] = 0;
					}
					else{
						data[i][j] = INF;
					}
				}
			}
			for(int i = 0; i < n; i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int value = sc.nextInt();
				data[from][to] = value;
				data[to][from] = value;
			}
			for(int j = 0; j < 10; j++){
				for(int i = 0; i < 10; i++){
					for(int k = 0; k < 10; k++){
						if(data[i][j] < INF && data[j][k] < INF)
						data[i][k] = Math.min(data[i][k], data[i][j] + data[j][k]);
					}
				}
			}
//			for(int i = 0; i < n; i++){
//				for(int j = 0; j < n; j++){
//					if(data[i][j] <= 600){
//						System.out.print(data[i][j] + " ");
//					}
//					else{
//						System.out.print("INF ");
//					}
//				}
//				System.out.println();
//			}

			int ind = 0;
			int ans = INF;
			for(int i = 0; i < 10 ; i++){
				int sum = 0;
				for(int j = 0; j < 10; j++){
					if(data[i][j] >= INF){
						continue;
					}
					sum += data[i][j];
				}
				if(sum == 0){
					continue;
				}
				if(ans > sum){
					ans = sum;
					ind = i;
				}
			}
			System.out.println(ind + " " + ans);

		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}