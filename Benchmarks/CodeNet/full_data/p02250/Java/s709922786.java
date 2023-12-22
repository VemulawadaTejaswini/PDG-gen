import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strT = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] strQ = new String[n];
		
		constructSA(strT);

		for(int i = 0; i < n; i++){
			strQ[i] = br.readLine();
			
			if(strT.length() >= strQ[i].length() &&  contain(strT, strQ[i])){
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
				

	}
	
	static final int MAX_N = 1000000 + 1;
	static int rank[] = new int[MAX_N];
	static int tmp[] = new int[MAX_N];
	static Integer sa[];// = new Integer[MAX_N];
	static int n;
	static int k;
	
	static boolean compareSA(int i, int j, int n, int k){
		if(rank[i] != rank[j]){
			return rank[i] < rank[j];
		}
		else {
			int ri = i + k <= n ? rank[i + k] : -1;
			int rj = j + k <= n ? rank[j + k] : -1;
			return ri < rj;
		}
	}
	
	static void constructSA(String s){
		n = s.length();
		
		sa = new Integer[n + 1];
		
		for(int i = 0; i < sa.length; i++){
			sa[i] = 0;
		}
		
		for(int i = 0; i <= n; i++){
			sa[i] = i;
			rank[i] = i < n ? s.charAt(i) : -1;
		}
		
//		System.out.println(sa[0]);
		
		for(k = 1; k <= n; k *= 2){
//			System.out.println("k = "+k);
			Arrays.sort(sa, new Comparator<Integer>() {
				public int compare(Integer i, Integer j){
//					System.out.println(i+" "+j);
					if(rank[i] != rank[j]){
						return rank[i] - rank[j];
					}
					else {
						int ri = i + k <= n ? rank[i + k] : -1;
						int rj = j + k <= n ? rank[j + k] : -1;
						return ri - rj;
					}
				}
			});
			
			tmp[sa[0]] = 0;
			for(int i = 1; i <= n; i++){
				tmp[sa[i]] = tmp[sa[i- 1]] + (compareSA(sa[i - 1], sa[i], n, k) ? 1 : 0);
			}
			
			for(int i = 0; i <= n; i++){
				rank[i] = tmp[i];
			}
		}
//		
//		for(int i = 0; i <= 11; i++){
//			System.out.println("i = "+i+" sa[i] = "+ sa[i] + " s.sub = "+s.substring(sa[i]));
//		}
		
	}
	
	static boolean contain(String s, String t){
		int a = 0;
		int b = s.length();
		while(b - a > 1){
			int c = (a + b)/2;
			
//			System.out.println("sa[c] = "+sa[c] + " t.length " + t.length());
			if((s.substring(sa[c], Math.min(sa[c] + t.length(), s.length()))).compareTo(t) < 0){
				a = c;
			}
			else {
				b = c;
			}
		}
		
		return (s.substring(sa[b], Math.min(sa[b]+t.length(), s.length()) )).compareTo(t) == 0;
	}
}
