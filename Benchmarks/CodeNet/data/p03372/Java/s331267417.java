import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//the num of sushi
		int N = sc.nextInt();

		//lenght of table
		long C = sc.nextLong();

		long[] tokeiX = new long[N+1];
		long[] tokeiV = new long[N+1];
		long[] hantokeiX = new long[N+1];
		long[] hantokeiV = new long[N+1];

		for(int i=0; i<N; i++) {
			tokeiX[i+1] = sc.nextLong();
			tokeiV[i+1] = sc.nextLong();
			hantokeiX[N-i] = C - tokeiX[i];
			hantokeiV[N-i] = tokeiV[i];
		}

		long result =0;

		//hidari tokeimawarikazu migi modottehantokeimawarikazu
		long[][] hoge = new long[N+1][N+1];
		hoge[0][0] = 0L;

		for(int i=1; i<N+1;i++) {
			hoge[i][0] = hoge[i-1][0] + tokeiV[i] - tokeiX[i] + tokeiX[i-1];
			hoge[i][1] = hoge[i][0] + hantokeiV[1] - tokeiX[i] -hantokeiX[1];

			for(int j=2; j<N-i+1;j++) {
				hoge[i][j] = hoge[i][j-1] + hantokeiV[j] - hantokeiX[j] + hantokeiX[j-1];
				if( hoge[i][j] > result) {
					result = hoge[i][j];
				}
			}
		}
		long[][] fuga = new long[N+1][N+1];
		fuga[0][0] = 0L;
		for(int i=1; i<N+1;i++) {
			fuga[i][0] = fuga[i-1][0] + hantokeiV[i] - hantokeiX[i] + hantokeiX[i-1];
			fuga[i][1] = fuga[i][0] + tokeiV[1] - hantokeiX[i] - tokeiX[1];

			for(int j=2; j<N-i+1;j++) {
				fuga[i][j] = fuga[i][j-1] + tokeiV[j] - tokeiX[j] + tokeiX[j-1];
				if( fuga[i][j] > result) {
					result = fuga[i][j];
				}
			}
		}

		System.out.println(result);


	}

}
