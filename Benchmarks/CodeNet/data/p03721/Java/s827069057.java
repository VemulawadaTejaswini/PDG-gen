

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(!map.containsKey(a)){
				map.put(a, b);
			}
			else {
				map.put(a, map.get(a) + b);
			}
		}

		for(int i = 1; i <= 100000; i++){
			if(!map.containsKey(i)){
				continue;
			}
			k -= map.get(i);

			if(k <= 0){
				System.out.println(i);
				break;
			}
		}
	}
}
