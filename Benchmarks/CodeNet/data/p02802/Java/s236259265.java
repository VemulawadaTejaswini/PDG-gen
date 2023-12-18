import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute3();
	}
	
	private static void execute3() {
		try (Scanner sc = new Scanner(System.in)) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			int[] tryN = new int[M];
			boolean[] ac = new boolean[M];
			for(int j=0;j<M;j++) {
				tryN[j]=0;
				ac[j]=false;
			}
			
			for(int i=0;i<N;i++) {
				int p = sc.nextInt()-1;
				String r = sc.next();
				if(r.equals("AC")) {
					if(!ac[p]) {
						ac[p]=true;
					}
				} else {
					if(!ac[p]) {
						tryN[p]++;
					}
				}
				
			}
			
			int ansAc=0;
			int wa=0;
			for(int i=0;i<M;i++) {
				if(ac[i]) {
					ansAc++;
					wa+=tryN[i];
				}
			}
			System.out.println(ansAc+" "+wa);
		}
	}
}