import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] arr = new int[n];

		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> lst = new ArrayList<Integer>();
		int i1 = 1;
		k--;
		while(k >= 0 && !lst.contains(arr[i1-1])) {
			lst.add(i1);
			i1 = arr[i1-1];
			k--;
			//System.out.println(" i1 : " + i1);
		}

		if(k <= 0) {
			System.out.println(i1);
		}
		else {
			int a1 = lst.indexOf(arr[i1-1]);
			int mod = lst.size() - a1;
			k %= mod;
			while(k >= 0) {
				i1 = arr[i1-1];
				//System.out.println(" i1 : " + i1);
				k--;
			}
			System.out.println(i1);
		}
	}
}