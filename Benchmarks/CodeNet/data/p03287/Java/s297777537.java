
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		int sum[] = new int[n+1];
		sum[0]=0;
		for(int i=0; i<n; i++) {
			sum[i+1]=(sum[i]+a[i])%m;
		}

		long ans = 0;
		HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
		for(int i=0; i<=n; i++) {
			int v = sum[i];
			ans += map.containsKey(v) ? map.get(v) : 0;
			map.put(v, map.containsKey(v) ? map.get(v)+1 : 1);
		}
		System.out.println(ans);
		sc.close();
	}


}
