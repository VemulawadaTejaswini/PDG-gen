
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long W=sc.nextLong();

		long w0=0;
		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0; i<n; i++) {
			long w=sc.nextLong();
			long v=sc.nextLong();
			if(i==0) w0=w;
			list.get((int)(w-w0)).add(v);
		}
		for(int i=0; i<n; i++) {
			Collections.sort(list.get(i),Collections.reverseOrder());
		}

		long sum[][] = new long[4][n+1];

		for(int i=0; i<4; i++) {
			sum[i][0]=0;
		}

		for(int i=0; i<4; i++) {
			ArrayList<Long> ll = list.get(i);
			for(int j=0; j<ll.size(); j++) {
				sum[i][j+1] = sum[i][j]+ll.get(j);
			}
		}

		long max = 0;
		for(int i=0; i<=list.get(0).size();i++) {
			for(int j=0;j<=list.get(1).size(); j++) {
				for(int k=0; k<=list.get(2).size(); k++) {
					for(int l=0; l<=list.get(3).size(); l++) {
						if(i*(w0) + j*(w0+1) + k*(w0+2) + l*(w0+3) > W) continue;
						max = Math.max(max, sum[0][i]+sum[1][j]+sum[2][k]+sum[3][l]);
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}


}
