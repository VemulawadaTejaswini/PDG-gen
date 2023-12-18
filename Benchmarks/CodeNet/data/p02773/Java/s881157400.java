import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str2 = new String[N];
		Set<String> H = new HashSet<String>();
		ArrayList<Pair> S = new ArrayList<Pair>();
		
		for(int i=0; i<N; i++){
			str2[i] = sc.next();
			H.add(str2[i]);
		}
		Iterator<String> ite = H.iterator();
		for(int i=0; i<H.size(); i++){
			int count = 0;
			String iterator = ite.next();;
			for(int j=0; j<N; j++){
				if(iterator.equals(str2[j])){
					count++;
				}
			}
			Pair pair = new Pair(iterator, count);
			S.add(pair);
		}
		
		Collections.sort(S, new ScoreComparator2());
		for(int i=0; i<S.size(); i++){
			if(i>0&&S.get(i).n<S.get(i-1).n){
				break;
			}
			System.out.println(S.get(i).s);
			//System.out.println(S.get(i).n);
		}

	}

}

class ScoreComparator2 implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {
		if(p1.n==p2.n){
			if(p1.s.compareTo(p2.s)<0){
				return -1;
			}else{
				return 1;
			}
		}else{
			return p1.n > p2.n ? -1 : 1;
		}
		
	}
}

class Pair {
	public String s;
	public int p;
	public int n;

	Pair(String S, int n){
		this.s = S;
		this.n = n;
	}

	Pair(String S, int P, int n){
		this.s = S;
		this.p = P;
		this.n = n;
	}
}
