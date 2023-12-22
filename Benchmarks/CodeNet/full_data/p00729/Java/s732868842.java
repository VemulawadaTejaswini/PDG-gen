import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private void doIt(){
		Scanner sc = new Scanner(System.in);
		int START = 540;
		int END = 1260;
		int [][] data = new int[END + 1][10000 + 1];
		int [][] sum = new int[END + 1][ 10000 + 1];
		while(true){
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N == 0 && M == 0){
				break;
			}
			int r = sc.nextInt();
			for(int i = START ; i <= END; i++){
				Arrays.fill(data[i], 0);
			}
			int t,m,s;
			for(int i = 0; i < r; i++){
				t = sc.nextInt();
				sc.nextInt();
				m = sc.nextInt();
				s = sc.nextInt();
				if(s == 1){
					data[t][m] = 1;
				}
				else{
					data[t][m] = -1;
				}
			}

			for(int i = 1; i <= M; i++){
				int count = 0;
				for(int j = START; j <= END; j++){
					int temp = data[j][i];
					if(data[j][i] == -1){
						data[j][i] = 1;
						count +=temp;
						continue;
					}
					if(count > 0){
						data[j][i] = 1;
					}
					else{
						data[j][i] = 0;
					}
					count +=temp;

				}
			}
			//int [][] sum = new int[END + 1][M + 1];
			for(int i = START ; i <= END; i++){
				Arrays.fill(sum[i], 0);
			}
			for(int i=0; i <= M; i++){
				sum[START][i] = data[START][i];
				for(int j = START + 1; j <= END; j++){
					sum[j][i] += sum[j-1][i] + data[j][i];
				}
			}

//			for(int i = 774 ; i <= 781; i++){
//				System.out.println(sum[i][1]);
//			}

			int q = sc.nextInt();
			for(int i =0 ;i < q; i++){
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int mm = sc.nextInt();
				int ans = sum[te][mm] - sum[ts][mm];
				System.out.println(ans);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}