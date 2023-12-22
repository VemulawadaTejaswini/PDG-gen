import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			HashMap<Integer, Integer> dupMap = new HashMap<>(); 
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				if ( dupMap.containsKey(aArray[i])) {
					int current = dupMap.get(aArray[i]);
					dupMap.put(aArray[i], current+1);
				}
				else {
					dupMap.put(aArray[i], 1);
				}
					
			}
			
//			Arrays.sort(aArray);
			
			
			long ans = 0;
			
			List<Integer> uniqList = new ArrayList<>(dupMap.keySet());
			Collections.sort(uniqList);
			
			for(int i = 0 ; i < uniqList.size() ; i++ ) {
				int ai = uniqList.get(i);
				
				if (dupMap.get(ai) > 1) {
					continue;
				}
				
				int rootAi = (int)Math.sqrt(ai)+1;
				
				boolean isOK = true;
				for(int j = 0 ; j < i ; j++ ) {
					int aj = uniqList.get(j);
					
					if ( ai % aj == 0 ) {
						isOK = false;
						break;
					}
					
					if ( aj > rootAi) {
						break;
					}
				}
				
				if ( isOK ) {
//					System.out.println(ai);
					ans++;
				}
			}
			
			System.out.println(ans);
			
		}
	}

}