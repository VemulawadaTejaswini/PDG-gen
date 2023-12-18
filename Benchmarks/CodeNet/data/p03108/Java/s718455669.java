import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Island> islands = new ArrayList<Island>();
		ArrayList<ArrayList> group = new ArrayList<ArrayList>();
		int N,M;
		int a,b;
		N = sc.nextInt();
		M = sc.nextInt();
		int[] bridgeA = new int[M];
		int[] bridgeB = new int[M];
		for(int i = 0;i<N;i++) {
			islands.add(new Island());
		}
		for(int i = 0;i<M;i++) {
			a=sc.nextInt()-1;
			b=sc.nextInt()-1;
			islands.get(a).addpair(islands.get(b));
			islands.get(b).addpair(islands.get(a));
			bridgeA[i] = a;
			bridgeB[i] = b;
		}
		long fuben;
		long sum;
		long init;

		group.add(search(islands.get(0),-1));
		for(Island isl:islands) {
			if(isl.isyet(-1)) {
				group.add(search(isl, -1));
			}
		}

		init=0;
		if(group.size()!=1) {
			init=0;
			for(int j = 0; j<group.size();j++) {
				for(int k = j+1;k<group.size();k++) {
					init -= group.get(j).size()*group.get(k).size();
				}
			}
		}


		for(int i = 0;i<M;i++) {
			group.clear();
			islands.get(bridgeA[i]).delpair(islands.get(bridgeB[i]));
			islands.get(bridgeB[i]).delpair(islands.get(bridgeA[i]));

			group.add(search(islands.get(0),i));
			for(Island isl:islands) {
				if(isl.isyet(i)) {
					group.add(search(isl, i));
				}
			}

			fuben=0;
			if(group.size()!=1) {
				fuben=init;
				for(int j = 0; j<group.size();j++) {
					for(int k = j+1;k<group.size();k++) {
//						System.out.print(group.get(j).size() + "  " + group.get(k).size() + "  :");
						fuben += group.get(j).size()*group.get(k).size();
					}
				}
			}
			System.out.println(fuben);
		}
	}

	private static ArrayList search(Island island, int i) {
		ArrayList ret = new ArrayList<Island>();
		island.setphase(i);
		ret.add(island);

		go(island,ret,i);
		return ret;
	}

	private static void go(Island island, ArrayList ret, int i) {
		for(Island isl : island.pair) {
			if(isl.isyet(i)) {
				isl.setphase(i);
				ret.add(isl);
				go(isl,ret,i);
			}
		}
	}
	static int gcd(int m, int n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}

	static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}
}

class Island{
	int phase = 0;
	ArrayList<Island> pair = new ArrayList<Island>();
	void addpair(Island island) {
		pair.add(island);
	}
	void delpair(Island island) {
		pair.remove(island);
	}
	void setphase(int i) {
		phase = i;
	}
	boolean isyet(int i) {
		return phase == i ? false : true;
	}
}
