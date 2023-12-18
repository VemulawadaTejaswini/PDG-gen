import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n+1];
		for(int i=1; i<=n; i++) a[i] = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		int [] hai = new int[32];
		hai[0] = 1;
		for(int i=1; i<32; i++) hai[i] = hai[i-1]*2;

		long ans = 0;
		Integer u, ok;
		for(int i=1; i<=n; i++){
			ok = 0;
			for(int j=1; j<32; j++){ 
				//System.out.print(hai[j] - a[i] + " ");
				u = map.get(hai[j] - a[i]);
				if(u != null && u > 0){
					ans += 1;
					map.put(hai[j]-a[i], u-1);
					ok = 1;
					break;
				}
			}
			//System.out.println();
			if(ok==0)
				map.put(a[i], 1);
		}
		System.out.println(ans);
	}
}