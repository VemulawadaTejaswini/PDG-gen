import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextInt();
		long A[] = new long[N];
		long F[] = new long[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		for(int i = 0;i < N;i++) {
			F[i] = scn.nextLong();
		}

		PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();
		Arrays.sort(A);
		Arrays.sort(F);
		for(int i = 0;i < N;i++) {
			PQ.add(new Pair(A[i],F[N-i-1]));
		}

		for(int i = 0;i < K;i++) {
			Pair P = PQ.poll();
			if(P.first>0) {
				P.first--;
			}
			PQ.add(P);
		}
		Pair M = PQ.poll();
		System.out.println(M.first*M.second);
	}

}

class Pair implements Comparable<Pair>{
	long first,second;
	public Pair(long f,long s) {
		this.first = f;
		this.second = s;
	}
	@Override
	public int compareTo(Pair o) {//Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if(this.first*this.second < o.first*o.second) {
			return 1;
		}
		if(this.first*this.second > o.first*o.second) {
			return -1;
		}
		return 0;
	}
}