import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair> S = new ArrayList<Pair>();

		for(int i=0; i<N; i++){
			String str = sc.next();
			boolean find = false;
			for(int j=0; j<S.size();j++){
				if(S.get(j).s.equals(str)){
					S.get(j).n++;
					find = true;
				}
			}
			if(find==false){
				Pair pair = new Pair(str, 1);
				S.add(pair);
			}
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