import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static int N=0,M=0,X=0,C=0;
	static int[][] Maps;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		HashMap<Integer, TreeSet<Integer>> Dic  = new HashMap<Integer, TreeSet<Integer>>();
		
		Maps = new int[M][2];
		for(int i=0;i<M;i++) {
			X =sc.nextInt();
			C =sc.nextInt();
			Maps[i][0] = X;
			Maps[i][1] = C;
			
			if(Dic.get(X) == null) {
				TreeSet<Integer> CList = new TreeSet<Integer>();
				CList.add(C);
				Dic.put(X, CList);
			}else {
				Dic.get(X).add(C);
			}
		}
		int Num;
		for(int i=0;i<M;i++) {
			Iterator<Integer> iterator = Dic.get(Maps[i][0]).iterator();
			Num = 1;
			while(iterator.hasNext()) {
				if(iterator.next() == Maps[i][1]) {
					System.out.println(String.format("%06d", Maps[i][0])+String.format("%06d", Num));
					break;
				}
				Num++;
			}
		}
	}
}