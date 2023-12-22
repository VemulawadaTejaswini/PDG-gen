import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] aArray = new int[m];
			int[] bArray = new int[m];
			
			for(int i = 0 ; i < m ; i++ ) {
				aArray[i] = sc.nextInt();
				bArray[i] = sc.nextInt();
			}
			
			//最大の友達グループのサイズを求めることと同じ
			int[] gArray = new int[n+1];
			int[] counts = new int[n+1];
			Map<Integer, Integer> dupMap = new HashMap<>(); 
		
			int gid = 1;
			for(int i = 0 ; i < m ; i++ ) {
				int cgid = gid;
				if (gArray[aArray[i]] > 0 ) {
					cgid = gArray[aArray[i]];
					if ( gArray[bArray[i]] > 0 ) {
						if (gArray[aArray[i]] == gArray[bArray[i]] ) {
							//do nothing
						}
						else {
							//merge pair
							dupMap.put(gArray[bArray[i]], cgid);
							int temp = counts[cgid];
							counts[cgid] = counts[gArray[bArray[i]]];
							counts[gArray[bArray[i]]] += temp;
						}
					}
					else {
						gArray[bArray[i]] = cgid;
						counts[cgid] += 1;
					}
				}
				else if ( gArray[bArray[i]] > 0 ) {
					cgid = gArray[bArray[i]];
					gArray[aArray[i]] = cgid;
					counts[cgid] += 1;
				}
				else {
					dupMap.put(cgid, cgid);
					gArray[aArray[i]] = cgid;
					gArray[bArray[i]] = cgid;
					counts[cgid] += 2;
					gid++;
				}
			}
			
			int max = 0;
			for(int i = 0 ; i < gid ; i++ ) {
				if ( counts[i] > max ) {
					max = counts[i];
				}
			}
			
			System.out.println(max);
			
		}
	}

}