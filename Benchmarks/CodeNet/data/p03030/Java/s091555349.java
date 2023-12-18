

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		TreeMap <String, Integer> store = new TreeMap <String, Integer>();
		
		
		for (int i = 0; i<N; i++){
			String Si=sc.next();
			int Pi=sc.nextInt();
			
			Si=Si+"++"+Integer.toString(100-Pi);
			store.put(Si, i+1);
			
			}
			
		sc.close();
		
		while (store.isEmpty()==false) {
			System.out.println(store.firstEntry().getValue());
			store.pollFirstEntry();
		}

	}

}
