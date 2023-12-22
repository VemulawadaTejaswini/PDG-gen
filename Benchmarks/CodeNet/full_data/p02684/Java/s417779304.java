import java.util.Scanner;
import java.util.TreeMap;
 
 
public class Main {
 
 
//	final int MOD = 1000000007;
 
	public static int min = 3000000;
 
	public static int[] a = {1, 2};
 
	public static void main(String[] args) {
 
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;
 
		int n = sc.nextInt();
		long k = sc.nextLong();
 
 
 
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
 
//		String s = sc.next();
 
//		int[] ans = new int[n];
 
//		ArrayList<Integer> list = new ArrayList<>();
 
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
 
		//-------------------------------------------------------------------------------------
 
		int index = 0;
		int stay = 1;
		int count = 0;
		int preCount = 0;
		while(!f) {
			map.put(stay, count);
 
			index = stay - 1;
			stay = a[index];
			count++;
			if(map.containsKey(stay)) {
				preCount = map.get(stay);
				 break;
			}
 
		}
 
		k -= preCount;
		k = k % (count - preCount);
        k += preCount;
 
		while(k > 0) {
			index = stay - 1;
			stay = a[index];
			k--;
		}
 
		ans = stay;
		//-------------------------------------------------------------------------------------
 
//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}
 
//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
 
		System.out.println(ans);
 
		sc.close();
	}
 
 
 
}