import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair> sp = new ArrayList<Pair>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for(int i=0; i<N; i++){
			String S = sc.next();
			int P = sc.nextInt();
			Pair pair = new Pair(S, P, i);

			//System.out.println(pair.s);
			//System.out.println(pair.p);

			sp.add(pair);
			ans.add(i);

		}

		Collections.sort(sp, new ScoreComparator());
		//Collections.sort(sp);

		for(int i=0; i<N; i++){
			//System.out.println(sp.get(i).s);
			//System.out.println(sp.get(i).p);
			System.out.println(sp.get(i).n+1);
		}


	}

}

class Pair {
	public String s;
	public int p;
	public int n;

	Pair(String S, int P, int n){
		this.s = S;
		this.p = P;
		this.n = n;
	}
}

class ScoreComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {
		if(p1.s.equals(p2.s)==true){
			return p1.p > p2.p ? -1 : 1;
		}else{
			if(p1.s.compareTo(p2.s)<0){
				return -1;
			}else{
				return 1;
			}
		}
		//return p1.p < p2.p ? -1 : 1;
		//return p1.s.equals(p2.s) ? -1 : 1;
	}
}

