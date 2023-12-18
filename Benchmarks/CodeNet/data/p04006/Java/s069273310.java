import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int x = Integer.parseInt(input1[1]);
		//[][0]は飼う時間
		//[][1]に　1が入っているとxよりも早く飼える
		//[][2]に　1が入ってると飼っている状態
		//[][3]に　1が入っていると色を変えた
		long [][]slime = new long[N][4];
		int count = 0;
		long total=0;
		long result = 0;
		String []input2 = br.readLine().split(" ");
		for(int j=0;j<N;j++) {
			int i = Integer.parseInt(input2[count]);
			total += i;
			slime[count][0] = i;
			if(i < x) {
				slime[count][1] = 1;
				slime[count][2] = 1;
				result += i;
			}
			count++;
		}
		if(total < x) {
			System.out.println(total);
			return;
		}else {
			while(true) {
				for(int i =N-1 ;i>=0;i--) {
					if(slime[i][3] == 0 ) {
						if(slime[i][2] ==1) {
							if(i+1 < N) {
								slime[i][2] = 0;
								slime[i+1][2] = 1;
								slime[i+1][3] = 1;
							}else{
								slime[i][2] = 0;
								slime[0][2] = 1;
								slime[0][3] = 1;
							}
						}
					}
				}
				result += x;
				for(int i =0 ;i<N;i++) {
					slime[i][3] = 0;
					if(slime[i][1] == 1 && slime[i][2] == 0) {
						slime[i][2] = 1;
						result += slime[i][0];
					}
				}
				int breakco = 0;
				for(int i =0 ;i<N;i++) {
					if(slime[i][2] == 1) {
						breakco++;
					}
				}
				if(breakco == N) {
					break;
				}
			}
			if(result >=total) {
				System.out.println(total);
			}else {
				System.out.println(result);
			}
		}
	}
}