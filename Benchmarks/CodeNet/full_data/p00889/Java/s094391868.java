import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int q = sc.nextInt();
			if((n|s|w|q) == 0) break;
			int [] a = create(s, w, n);
			int ans = 0;
			if(q == 2 || q == 5){
				int count = 0;
				for(int i = 0; i < n; i++){
					if(a[i] != 0){
						count++;
					}
					if(a[i] % q == 0){
						ans += count;
					}
				}
			}
			else{
				HashMap<Long, Integer> freq = new HashMap<Long, Integer>();
				freq.put(0L, 1);
				long now = 0, digitUp = 1;
				for(int i = n - 1; i >= 0; i--){
					now = (a[i] * digitUp + now) % q;
					digitUp = (digitUp * 10) % q;
					if(a[i] != 0 && freq.containsKey(now)){
						ans += freq.get(now);
					}
					if(freq.containsKey(now)){
						freq.put(now, freq.get(now) + 1);
					}
					else{
						freq.put(now, 1);
					}
				}
			}
			System.out.println(ans);
		}
	}

	private int[] create(int s, int w, int n) {
		int [] a = new int[n];
		int g = s;
		for(int i = 0; i < n; i++){
			a[i] = (g / 7) % 10;
			if(g % 2 == 0){
				g = (g / 2);
			}
			else{
				g = (g / 2) ^ w;
			}
		}
		return a;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}