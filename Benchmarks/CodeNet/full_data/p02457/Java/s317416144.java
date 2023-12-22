import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> S = new TreeSet<Integer>();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int com = sc.nextInt();
			if(com == 0){
				int x = sc.nextInt();
				S.add(x);
				System.out.println(S.size());
			}else if(com == 1){
				int x = sc.nextInt();
				if(S.contains(x)) System.out.println(1);
				else System.out.println(0);
			}else if(com == 2){
				int x = sc.nextInt();
				S.remove(x);
			}else{
				int L = sc.nextInt();
				int R = sc.nextInt();
				SortedSet SS = S.subSet(L, R + 1);
				for(Iterator j = SS.iterator(); j.hasNext();) System.out.println(j.next());
			}
		}
	}
}

