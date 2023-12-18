import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;
	static int N, M;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		int answer = 0;
		int[][] data = new int[M][2];

		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			data[i][0] = a;
			data[i][1] = b;
		}

		for(int i = 0; i < M; i++){
			int[][] nextData = new int[M][2];
			for(int j = 0; j < M; j++){
				if(i != j){
					nextData[j][0] = data[j][0];
					nextData[j][1] = data[j][1];
				}else{
					nextData[j][0] = -1;
					nextData[j][1] = -1;
				}
			}
			if(check(nextData, data[i][0], data[i][1]) == false){
				answer++;
			}
		}


		System.out.println(answer);


	}

	public static boolean check(int[][] d, int now, int end){
		if(now == end){
			return true;
		}
		boolean ans = false;
		for(int i = 0; i < M; i++){
			if(d[i][0] == now || d[i][1] == now){
				int[][] nextData = new int[M][2];
				int next;
				if(d[i][0] == now){
					next = d[i][1];
				}else{
					next = d[i][0];
				}
				for(int j = 0; j < M; j++){
					if(i != j){
						nextData[j][0] = d[j][0];
						nextData[j][1] = d[j][1];
					}else{
						nextData[j][0] = -1;
						nextData[j][1] = -1;
					}
				}
				ans = check(nextData, next, end);

				if(ans == true){
					break;
				}
			}
		}
		return ans;
	}
}