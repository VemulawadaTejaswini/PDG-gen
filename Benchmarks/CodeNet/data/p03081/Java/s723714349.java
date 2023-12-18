import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		HashMap<Character,ArrayList<Integer>> map = new HashMap<Character,ArrayList<Integer>>();
		int[] gorem = new int[N];
		for(int i=0;i<N;i++) {
			gorem[i]=1;
			char c = S.charAt(i);
			if(map.containsKey(c)) {
				map.get(c).add(i);
			}
			else {
				ArrayList<Integer> lis = new ArrayList<Integer>();
				lis.add(i);
				map.put(c,lis);
			}
		}
		for(int i=0;i<Q;i++) {
			/*
			for(int j=0;j<N;j++) {
				System.out.print(gorem.get(j));
			}
			System.out.println();
			*/
			char t = sc.next().charAt(0);
			String d = sc.next();
			//System.out.println(d.equals("R"));
			if(!map.containsKey(t)) continue;
			ArrayList<Integer> lisidx = map.get(t);
			HashMap<Integer,Integer> orig = new HashMap<Integer,Integer>();
			for(int id: lisidx) {
				orig.put(id,gorem[id]);
			}
			if(d.equals("R")) {	
				for(int id : lisidx) {
					int dif = orig.get(id);
					gorem[id] = gorem[id]-dif;
					if(id+1 < N) gorem[id+1] = gorem[id+1]+dif; 
				}
			}
			if(d.equals("L")) {
				for(int id : lisidx) {
					int dif = orig.get(id);
					gorem[id] = gorem[id]-dif;
					if(id-1 >= 0) gorem[id-1] = gorem[id-1]+dif; 
				}
			}
			
		}
		int count = 0;
		for(int i=0;i<N;i++) {
			count += gorem[i];
		}
		System.out.println(count);
	}
	
}
