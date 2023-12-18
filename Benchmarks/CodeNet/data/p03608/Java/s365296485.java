import java.util.*;

public class Main {
	static final long INF = 1000000000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// GET INPUT
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		ArrayList<Long> rl = new ArrayList<Long>();
		for(int i=0; i<R; i++) {
			rl.add(sc.nextLong());
		}
		long[][] d = new long[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				d[i][j] = INF;
			}
		}
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			d[A-1][B-1] = C;
			d[B-1][A-1] = C;
		}
		
		
		// GET INPUT END
		
		sc.close();
		
		// shori
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
						d[j][i] = d[i][j];
					}
				}
			}
		}
		long min = INF;
		for(int i=0; i<INF; i++) {
			long temp = 0;
			Collections.shuffle(rl);
			for(int j=0; j<rl.size()-1; j++) {
				temp += d[(int) (rl.get(j)-1)][(int) (rl.get(j+1)-1)];
			}
			if(temp < min) {
				min = temp;
			}
		}
		System.out.println(min);
		
	}

}
