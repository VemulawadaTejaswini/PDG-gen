import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),ans=0;
		Map<Integer,Boolean> f = new HashMap<Integer,Boolean>();
		int[] p = new int[N];
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
			f.put(p[i],true);
		}
		for(int i=0;i<N;i++) {
			for(int j=i;j>=0;j--) {
				if(p[i]>p[j]) {
					f.put(p[i],false);
					break;
				}
			}
		}
		for(int key:f.keySet()) if(f.get(key)) ans++;
		System.out.println(ans);
	}
}