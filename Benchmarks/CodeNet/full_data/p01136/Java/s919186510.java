import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		loop : while(true){
			int n = in.nextInt();
			if(n==0) break;
			boolean[][] sch = new boolean[31][n];
			for(int i=0;i<n;i++){
				int m = in.nextInt();
				for(int j=0;j<m;j++){
					sch[in.nextInt()][i] = true;
				}
			}
			long[] tag = new long[n];
			for(int i=0;i<n;i++){
				tag[i] = (1L<<i);
			}
			for(int k=1;k<=30;k++){
				long gather = 0;
				for(int i=0;i<n;i++){
					if(sch[k][i]) gather = gather | tag[i];
				}
				if(gather==(1L<<n)-1){
					System.out.println(k);
					continue loop;
				}
				for(int i=0;i<n;i++){
					if(sch[k][i]) tag[i] = gather;
				}
			}
			System.out.println(-1);
			System.gc();
		}
	}
}