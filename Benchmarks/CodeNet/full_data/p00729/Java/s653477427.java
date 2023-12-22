
import java.util.*;

public class Main {

	private void doIt(){
		Scanner sc = new Scanner(System.in);
		final int START = 540;
		final int END = 1260;
		int [][] data = new int[END + 1][10000 + 1];
		int N,M,r;
		int t,m,s;
		while(true){
			N = sc.nextInt();
			M = sc.nextInt();
			if(N == 0 && M == 0){
				break;
			}
			r = sc.nextInt();
			for(int i = START ; i <= END; i++){
				Arrays.fill(data[i], 0);
			}

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
					count += data[j][i];
					if(count > 0){
						data[j][i] = 1;
					}
					else{
						data[j][i] = 0;
					}

				}
			}

//			for(int i=1; i <= M; i++){
//				for(int j = START + 1; j <= END; j++){
//					data[j][i] = data[j-1][i] + data[j][i];
//				}
//			}

//			for(int i = 774 ; i <= 781; i++){
//				System.out.println(i + " " +data[i][1]);
//			}

			int q = sc.nextInt();
			for(int i =0 ;i < q; i++){
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int mm = sc.nextInt();
				int ans = 0;
				for(int j=ts; j < te; j++){
					ans += data[j][mm];
				}
				System.out.println(ans);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}