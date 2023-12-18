import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static int count(int i , int j , TreeSet<Integer> otherPos){
		int k = 2 * j - i;
		int o = otherPos.contains(k) ? 1 : 0;		
		return otherPos.tailSet(j + 1).size() - o;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		TreeSet<Integer> bpos = new TreeSet<Integer>();
		TreeSet<Integer> rpos = new TreeSet<Integer>();
		TreeSet<Integer> gpos = new TreeSet<Integer>();
		for(int i = 0 ; i < N ; ++i){
			if(s.charAt(i) == 'B'){
				bpos.add(i);
			}else if(s.charAt(i) == 'R'){
				rpos.add(i);
			}else{
				gpos.add(i);
			}
		}
//		System.out.println(bpos.size()+" "+rpos.size()+" "+gpos.size());
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			char ci = s.charAt(i);
			for(int j = i + 1 ; j < N ; ++j){
				char cj = s.charAt(j);
				if(ci == cj){
					continue;
				}
				if((ci == 'R' && cj == 'G') || (ci == 'G' && cj == 'R')){
					ret += count(i, j, bpos);										
				}
				if((ci == 'G' && cj == 'B') || (ci == 'B' && cj == 'G')){
					ret += count(i, j, rpos);					
				}
				if((ci == 'R' && cj == 'B') || (ci == 'B' && cj == 'R')){
					ret += count(i, j, gpos);
				}

			}
		}
		System.out.println(ret);
	}
}
