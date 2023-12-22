import java.util.Arrays;
import java.util.Scanner;

//ICPC Ranking
public class Main{

	class R implements Comparable<R>{
		int id, correct, time, score;
		int[] penalty;
		int[] submit;
		boolean[] corrected;
		public R(int id) {
			this.id = id;
			corrected = new boolean[11];
			penalty = new int[11];
			submit = new int[11];
		}
		public void calc(){
			score = correct * 100000000 - time;
		}
		@Override
		public int compareTo(R r) {
			if (score != r.score) return r.score - score;
			return r.id-id;
		}
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int M = sc.nextInt(), T = sc.nextInt(), P = sc.nextInt(), R = sc.nextInt();
			if ((M|T|P|R)==0)break;
			R[] teams = new R[T];
			for(int i=0;i<T;i++)teams[i]=new R(i+1);
			while(R--!=0){
				int m = sc.nextInt(), t = sc.nextInt()-1, p = sc.nextInt(), j = sc.nextInt();
				if (j!=0) {
					teams[t].penalty[p]++;
				} else {
					teams[t].submit[p] = m;
					teams[t].corrected[p] = true;
				}
			}
			for(int i=0;i<T;i++){
				for(int j=1;j<=P;j++){
					if (teams[i].corrected[j]){
						teams[i].correct++;
						teams[i].time += teams[i].submit[j] + 20 * teams[i].penalty[j];
					}
				}
				teams[i].calc();
			}
			Arrays.sort(teams);
			System.out.print(teams[0].id);
			for(int i=1;i<T;i++){
				if (teams[i].score == teams[i-1].score) System.out.print("="+teams[i].id);
				else System.out.print(","+teams[i].id);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}