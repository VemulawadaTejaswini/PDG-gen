import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N=0,M=0,X=0,C=0;
	static int[][] Maps;
//	static List<Integer> CList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		HashMap<Integer, List<Integer>> Dic  = new HashMap<Integer, List<Integer>>();
		
		Maps = new int[M][2];
		for(int i=0;i<M;i++) {
			X =sc.nextInt();
			C =sc.nextInt();
			Maps[i][0] = X;
			Maps[i][1] = C;
			
			if(Dic.get(X) == null) {
				List<Integer> CList = new LinkedList<Integer>();
				CList.add(C);
				Dic.put(X, CList);
			}else {
				Dic.get(X).add(C);
			}
		}
		for (Integer key : Dic.keySet()) {
			Collections.sort(Dic.get(key));
		}
		for(int i=0;i<M;i++) {
			System.out.println(String.format("%06d", Maps[i][0])+String.format("%06d", Dic.get(Maps[i][0]).indexOf(Maps[i][1])+1));
		}
	}

}