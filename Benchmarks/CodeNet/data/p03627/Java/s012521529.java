import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		TreeMap <Integer, Integer> store = new TreeMap <Integer, Integer>();
		int Ai=0;
		
		for (int i = 0; i<N; i++){
			Ai = sc.nextInt();
 
			if (store.containsKey(Ai)) 
				store.put(Ai, store.get(Ai) + 1);
			 else 
				store.put(Ai, 1);
		}
		
		int a=store.lastKey();
		int freq = store.get(store.lastKey());
		store.remove(a, freq);
		while (store.isEmpty()!=true && freq<2){
			a = store.lastKey();
			freq = store.get(store.lastKey());
			store.remove(a, freq);
		}


		if (store.isEmpty()!=true){
			int b=store.lastKey();
			int freq2 = store.get(store.lastKey());
			store.remove(b, freq2);
			
			while (store.isEmpty()!=true && freq2<2){
				b = store.lastKey();
				freq2 = store.get(store.lastKey());
				store.remove(b, freq2);
			}
			if (freq2>1)
				System.out.println(a*b);
			else
				System.out.println(0);
		}

		else
			System.out.println(0);
		
		sc.close();
	}

}
