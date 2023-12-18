import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str2 = new String[N];
		Set<String> H = new HashSet<String>();
		ArrayList<Pair> S = new ArrayList<Pair>(){
			@Override
	        public int indexOf(Object o) {
	            String target = null;
	            if (o instanceof String) {
	                target = ((String) o);
	            }

	            for (int i = 0; i < size(); i++) {
	                if (get(i).s.equals(target))
	                    return i;
	            }

	            return -1;
	        }
		};
      
		int max = 1;
		for(int i=0; i<N; i++){
			String str = sc.next();
			boolean find = false;
			int index = 0;
			
			index = S.indexOf(str);
			if(index!=-1){
				find = true;
			}
			if(find==true){
				S.get(index).n++;
				if(max<S.get(index).n){
					max = S.get(index).n;
				}
			}else{
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
