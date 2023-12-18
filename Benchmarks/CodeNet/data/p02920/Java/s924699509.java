import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int SN = (int)Math.pow(2, N);
		long[] S = new long[SN];
		for(int i = 0;i < SN;i++) {
			S[i] = scn.nextLong();
		}
		Arrays.sort(S);
		PriorityQueue<Power> PQ = new PriorityQueue<Power>();

		PQ.add(new Power(S[SN-1],N));
		boolean can = true;
		for(int i = SN-2;i >=0;i--) {
			Power p = PQ.poll();
			if(p.v > S[i]) {
				p.num--;
				if(p.num!=0) {

					PQ.add(p);
					PQ.add(new Power(S[i],p.num));
				}
				continue;
			}
			can = false;
			break;
		}
		System.out.println(can?"Yes":"No");


	}

}

class Power implements Comparable<Power>{
	long v;
	int num;
	public Power(long v, int num) {
		this.v = v;
		this.num = num;
	}


	@Override
	public int compareTo(Power o) {
		if(this.v < o.v)return 1;
		if(this.v > o.v)return -1;
		return 0;
	}

}
