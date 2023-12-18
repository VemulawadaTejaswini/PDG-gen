import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N=0,M=0,X=0,C=0;
	static int[][] Maps;
	static List<Integer> CList;
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
		}
		
		for(int i=1;i<=N;i++) {
			CList = new ArrayList<Integer>();
			for(int j=0;j<M;j++) {
				if(Maps[j][0] == i) {
					CList.add(Maps[j][1]);
				}
			}
			Collections.sort(CList);
			Dic.put(i, CList);
		}
		for(int i=0;i<M;i++) {
			for(int j=0;j<Dic.get(Maps[i][0]).size();j++) {
				if(Maps[i][1] == Dic.get(Maps[i][0]).get(j)) {
					System.out.println(String.format("%06d", Maps[i][0])+String.format("%06d", j+1));
				}
			}
		}
	}

}


