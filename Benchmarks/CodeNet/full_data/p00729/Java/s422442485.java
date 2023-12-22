import java.util.Scanner;

public class Main {

	private void doIt(){
		Scanner sc = new Scanner(System.in);
		int START = 540;
		int END = 1260;
		while(true){
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N == 0 && M == 0){
				break;
			}
			int r = sc.nextInt();
			int [][] data = new int[END + 1][M + 1];
			for(int i = 0; i < r; i++){
				int t = sc.nextInt();
				int n = sc.nextInt();
				int m = sc.nextInt();
				int s = sc.nextInt();
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
					if(count > 0){
						data[j][i] = 1;
					}
					else{
						data[j][i] = 0;
					}
					count += temp;
				}
			}

			int [][] sum = new int[END + 1][ M+ 1];
			for(int i=0; i <= M; i++){
				sum[START][i] = data[START][i];
				for(int j = START + 1; j <= END; j++){
					int temp = sum[j-1][i] + data[j][i];
					//System.out.println(temp);
					sum[j][i] += temp;
				}
			}

			int q = sc.nextInt();
			for(int i =0 ;i < q; i++){
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int mm = sc.nextInt();
				System.out.println(sum[te][mm] - sum[ts][mm]);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}