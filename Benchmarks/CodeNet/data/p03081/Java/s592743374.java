import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		HashMap<Character,ArrayList<Integer>> map = new HashMap<Character,ArrayList<Integer>>();
		ArrayList<Integer> gorem = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			gorem.add(1);
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
			if(d.equals("R")) {
				ArrayList<Integer> ngorem = new ArrayList<Integer>(gorem);
				for(int id : lisidx) {
					int dif = gorem.get(id);
					ngorem.set(id, ngorem.get(id)-dif);
					if(id+1 < N) ngorem.set(id+1, ngorem.get(id+1)+dif); 
				}
				gorem = ngorem;
			}
			if(d.equals("L")) {
				ArrayList<Integer> ngorem = new ArrayList<Integer>(gorem);
				for(int id : lisidx) {
					int dif = gorem.get(id);
					ngorem.set(id, ngorem.get(id)-dif);
					if(id-1 >= 0) ngorem.set(id-1, ngorem.get(id-1)+dif); 
				}
				gorem = ngorem;
			}
			
		}
		int count = 0;
		for(int i=0;i<N;i++) {
			count += gorem.get(i);
		}
		System.out.println(count);
	}
	
}
