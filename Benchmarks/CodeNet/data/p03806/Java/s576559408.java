import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Ma = in.nextInt();
		Mb = in.nextInt();
		int[] a = new int[N], b = new int[N], c = new int[N];
		for(int i=0;i<N;i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		int ans = r(a,b,c,0,0,0,0);
		System.out.println(ans > 5001 ? -1 : ans);
	}
	static HashMap<String, Integer> map = new HashMap<>();
	static int Ma, Mb;
	public static int r(int[] a, int[] b, int[] c, int index, int Aa, int Ab, int Ac){
		if(index >= a.length){
			return Ma*1.0/Mb == Aa*1.0/Ab ? Ac : Integer.MAX_VALUE;
		}
		String key = index + " " + Aa + " " + Ab + " " + Ac;
		if(map.containsKey(key)) return map.get(key);
		int ans =  Math.min(r(a, b, c, index+1, Aa+a[index], Ab+b[index], Ac+c[index]),
				r(a, b, c, index+1, Aa, Ab, Ac));
		map.put(key, ans);
		return map.get(key);
	}
}
