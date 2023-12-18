import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class SuffixComparator implements Comparator<Integer>{
		char[] Sarr;
		public SuffixComparator(String S) {
			this.Sarr = S.toCharArray();
		}
		@Override
		public int compare(Integer o1, Integer o2) {
			int i1 = o1;
			int i2 = o2;
			if(i1 == i2){
				return 0;
			}
			while(i1 < Sarr.length && i2 < Sarr.length){
				if(Sarr[i1] != Sarr[i2]){
					return Character.compare(Sarr[i1], Sarr[i2]);
				}
				i1++;
				i2++;				
			}
			if(i1 == Sarr.length){
				return -1;
			}
			if(i2 == Sarr.length){
				return 1;
			}
			return 0;
		}
	}
	static int longestPrefix(int s0 , int s1 , char[] carr){
		if(s0 > s1){
			return longestPrefix(s1, s0, carr);
		}
		int l = 0;
		int send = s1;
		while(s1 < carr.length && s0 < send){
			if(carr[s0] != carr[s1]){
				break;
			}
			++l;
			++s0;
			++s1;
		}
		return l;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		SuffixComparator comparator = new SuffixComparator(S);
		List<Integer> suffixes = new ArrayList<Integer>();
		for(int i = 0 ; i < N ; ++i){
			suffixes.add(i);
		}
		Collections.sort(suffixes, comparator);
		char carr[] = S.toCharArray();
		int max = 0;
		for(int i = 0 ; i < N - 1 ; ++i){
			int s0 = suffixes.get(i);
			// xxxyxxy
			// xxy
			// xxyxxy
			// a
			// aa
			// aaa
			// aaabaaa
			// aabaaa
			// abaaa
			// baaa
			
			// aaabaaa
			// xy
			// xyzxy
			// 
			// xyzzx
			// xyzzx
			// xyzzx
//			int s1 = suffixes.get(i + 1);
			int cur = 0;
			int k = 100;
			for(int j = i + 1 ; j < N ; j++){
				int s1 = suffixes.get(j);
				int l = longestPrefix(s0, s1, carr);
				if(cur >= l){
					break;
				}
				cur = Math.max(cur, l);
				if(j + k < N){
					int s2 = suffixes.get(j + k);
					int l2 = longestPrefix(s0, s2, carr);
					if(l < l2){
						j = j + k;
						cur = Math.max(cur, l2);
					}					
				}
			}
			max = Math.max(max, cur);
//			int l = longestPrefix(s0, s1, carr);
//			max = Math.max(max, l);
//			System.out.println(S.substring(s0)+" "+S.substring(s1)+" "+s0+" "+s1+" "+l);
			// 18
			// strangeorangebrang
		}
		System.out.println(max);
	}
}
