import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		long k = sc.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0; i< n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(!hm.containsKey(a[i])) {
				hm.put(a[i],b[i]);
			}
			else {
				hm.put(a[i], b[i] + hm.get(a[i]));
			}
		}
		sc.close();
		
		long sum = 0;
		int ans = 0;
		for(int num : hm.keySet()) {
			sum += (long)hm.get(num);
			if(k <= sum) {
			    ans = num;
				break;
			}
		}
		System.out.println(ans);

	}

}
