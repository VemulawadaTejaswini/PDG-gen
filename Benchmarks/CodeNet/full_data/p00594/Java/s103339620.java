import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			
			System.gc();

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(N);
			
			for(int i = 0; i < N; i++){
				final int A = sc.nextInt();
				
				int value = 0;
				if(map.containsKey(A)){
					value = map.get(A);
				}
				value++;
				
				map.put(A, value);
			}
			
			boolean flag = true;
			for(Entry<Integer, Integer> entry : map.entrySet()){
				//System.out.println(entry.getValue());
				
				if(entry.getValue() > N / 2){					
					System.out.println(entry.getKey());
					flag = true;
					break;
				}
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
		}

	}

}