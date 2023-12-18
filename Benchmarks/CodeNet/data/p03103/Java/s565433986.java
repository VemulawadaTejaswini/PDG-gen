import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			A[i] = a[i];
			B[i] = b[i];
		}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
		    map.put(a[i], b[i]);
		}
		int k = 0;
		for (int nKey: map.keySet()) {
			A[k] = nKey;
			k++;
		}
		k = 0;
		for (int nValue: map.values()) {
			B[k] = nValue;
			k++;
		}
		int cnt = 0;
		long ans = 0;
		int cnt2 = 0;
		int cnt3 = B[0];
		
		while(true) {
			
				if(cnt3 != 0) {
					cnt ++;
					ans += A[cnt2];
					cnt3 --;
				}else {
					cnt2 ++;
					cnt3 = B[cnt2];
				}
				if(cnt == m) {
					break;
				}
			}
			
			
			
		
		System.out.println(ans);
		sc.close();
	}
}
