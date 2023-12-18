import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			List<Long> hList = new ArrayList<Long>();
			for(int i = 0 ; i < n ; i++ )  {
				hList.add(sc.nextLong());
			}

			Collections.sort(hList);
			Collections.reverse(hList);
			
			for(int i = 0 ; i < k ; i++ ) {
				if ( hList.size() > 0) {
					hList.remove(0);
				}
			}
			
			long turns = hList.stream().mapToLong(l -> l).sum();
			
			System.out.println(turns);
		}
	}
}