

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		int a1[] = new int[n + 1];
		int a2[] = new int[n + 1];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			a1[i + 1] = a[i] + i + 1;
			a2[i + 1] = -a[i] + (i + 1);
		}

		HashMap<Integer, Integer> set1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> set2 = new HashMap<Integer, Integer>();

		for(int i = 1; i <= n; i++ ){
			if(!set1.containsKey(a1[i])){
				set1.put(a1[i], 1);
			}
			else {
				set1.put(a1[i], set1.get(a1[i]) + 1);
//				System.out.println("update for "+a1[i]);
			}

			if(!set2.containsKey(a2[i])){
				set2.put(a2[i], 1);
			}
			else {
				set2.put(a2[i], set2.get(a2[i]) + 1);
			}
		}

		Iterator<Integer> it = set1.keySet().iterator();

		int result = 0;

		while(it.hasNext()){
			int tmp = it.next();

			if(set2.containsKey(tmp)){
				result += set1.get(tmp) * set2.get(tmp);
			}

//			System.out.println("tmp "+tmp + " result "+result);
		}


		System.out.println(result);
	}

}
