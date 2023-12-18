import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int N=0,M=0,X=0,C=0;
	static int[][] Maps;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> Dic  = new HashMap<Integer, ArrayList<Integer>>();
		
		Maps = new int[M][2];
		for(int i=0;i<M;i++) {
			X =sc.nextInt();
			C =sc.nextInt();
			Maps[i][0] = X;
			Maps[i][1] = C;
			
			if(Dic.get(X) == null) {
				ArrayList<Integer> CList = new ArrayList<Integer>();
				CList.add(C);
				Dic.put(X, CList);
			}else {
				Dic.get(X).add(C);
			}
		}
		for(Integer Key:Dic.keySet()) {
			Collections.sort(Dic.get(Key));
		}
		for(int i=0;i<M;i++) {
			System.out.println(String.format("%06d", Maps[i][0])+String.format("%06d", Dic.get(Maps[i][0]).indexOf(Maps[i][1])+1));
					
		}
	}
}


