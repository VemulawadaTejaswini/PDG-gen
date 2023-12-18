import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//the num of sushi
		int N = sc.nextInt();

		//lenght of table
		long C = sc.nextLong();

		long[] tokeiX = new long[N];
		long[] tokeiV = new long[N];
		long[] hantokeiX = new long[N];
		long[] hantokeiV = new long[N];

		for(int i=0; i<N; i++) {
			tokeiX[i] = sc.nextLong();
			tokeiV[i] = sc.nextLong();
			hantokeiX[N-1-i] = C - tokeiX[i];
			hantokeiV[N-1-i] = tokeiV[i];
		}

		long result =0;

		long[] karori = new long[N];
		karori[0] = tokeiV[0];
		for(int i=1;i<N;i++) {
			karori[i] = karori[i-1] + tokeiV[i];
			if(karori[i] - tokeiX[i] > result) {
				result = karori[i] - tokeiX[i];
			}
		}

		karori[0] = hantokeiV[0];
		for(int i=1;i<N;i++) {
			karori[i] = karori[i-1] + hantokeiV[i];
			if(karori[i] - hantokeiX[i] > result) {
				result = karori[i] - hantokeiX[i];
			}
		}

		//hidari tokeimawarikazu migi modottehantokeimawarikazu
		long[][] hoge = new long[N+1][N+1];
		hoge[0][0] = 0L;
		hoge[1][0] = tokeiV[0] - tokeiX[0];
		hoge[0][1] = hantokeiV[0] - hantokeiX[0];

		for(int i=1; i<N;i++) {
			hoge[i][0] = hoge[i-1][0] + tokeiV[i] - tokeiX[i];
			for(int j=1; j<N-i;j++) {
				hoge[i][j] = hoge[i][j-1] + hantokeiV[j] - hantokeiX[j];
				if( hoge[i][j] > result) {
					result = hoge[i][j];
				}
			}
		}

		System.out.println(result);


	}

}
