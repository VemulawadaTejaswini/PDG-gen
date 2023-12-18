import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int []v = new int[N];
			for(int i = 0;i<N;i++)v[i] = scan.nextInt();
			Map<Integer,Integer> odd = new TreeMap<Integer,Integer>();
			Map<Integer,Integer> ev = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				if(i%2==0) {//奇数
				if(odd.containsKey(v[i])) odd.put(v[i], odd.get(v[i])+1);
				else odd.put(v[i], 1);
				}else {//偶数
					if(ev.containsKey(v[i])) ev.put(v[i], ev.get(v[i])+1);
					else ev.put(v[i], 1);
				}
			}
			/*
			ArrayList<Entry<Integer,Integer>> olist = new ArrayList<Entry<Integer, Integer>>(odd.entrySet());
			ArrayList<Entry<Integer,Integer>> elist = new ArrayList<Entry<Integer, Integer>>(ev.entrySet());
			Comparator<Entry<Integer,Integer>> com = new COMP();
			
			Collections.sort(olist,com);
			
			Collections.sort(elist,com);
			
			*/
			int emax = 0;
			for(Integer key:ev.keySet()) 
				if(ev.get(key)>emax)emax =ev.get(key); 
			int omax = 0;
			for(Integer va:odd.values())
				if(va>omax)omax=va;
			
			
			
			
			ArrayList<Integer> O = new ArrayList<Integer>(odd.keySet());
			ArrayList<Integer> E = new ArrayList<Integer>(ev.keySet());
			
			if(odd.size()+ev.size()==2&&O.get(0)==E.get(0)) {
				System.out.println(N/2);
				return;
			}
			
			
			System.out.println(N/2-emax+N/2-omax);
			
			
			
			
		}
		
		
	}
	static class COMP implements Comparator<Entry<Integer,Integer>>{
		public int compare(Entry<Integer,Integer> x,Entry<Integer,Integer> y) {
			return x.getValue().compareTo(y.getValue());
		}
		}
	
	
		

}
