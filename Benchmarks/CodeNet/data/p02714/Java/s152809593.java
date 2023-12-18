import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	static int count2(int i , ArrayList<Integer> pos1 , ArrayList<Integer> pos2){
		int v = Collections.binarySearch(pos1, i);
		if(v < 0){
			v = - v - 1;
		}
		if(v >= pos1.size()){
			return 0;
		}
		int ret = 0;
		for(int j = v ; j < pos1.size() ; ++j){
			int pj = pos1.get(j);
			int k = 2 * pj - i;
			int o = Collections.binarySearch(pos2, k) < 0 ? 0 : 1;
			int v2 = Collections.binarySearch(pos2, pj);
			v2 = - v2 - 1;
			if(v2 < pos2.size()){
				ret += pos2.size() - v2 - o;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		ArrayList<Integer> bpos = new ArrayList<Integer>();
		ArrayList<Integer> rpos = new ArrayList<Integer>();
		ArrayList<Integer> gpos = new ArrayList<Integer>();
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
			if(ci == 'R'){
				ret += count2(i , gpos, bpos);
				ret += count2(i , bpos, gpos);				
			}else if(ci == 'G'){
				ret += count2(i , rpos, bpos);
				ret += count2(i , bpos, rpos);								
			}else{
				ret += count2(i , gpos, rpos);
				ret += count2(i , rpos, gpos);												
			}
		}
		System.out.println(ret);
	}
}
