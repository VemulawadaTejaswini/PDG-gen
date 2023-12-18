import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();

		System.out.println(possible(a) ? "Possible" : "Impossible");
		sc.close();
	}
	
	static boolean possible(int[] a) {
		int N = a.length;
		Arrays.sort(a);
		
		int min = a[0];
		int max = a[N-1];
		if(max<min*2-1 || min*2<max)
			return false;
		
		int[] cnt = new int[min*2+1];
		for(int i=0; i<N; i++)
			cnt[a[i]]++;
		
		for(int i=min; i<=max; i++) {
			if(i==min) {
				if(max==min*2) {
					if(cnt[i]!=1)
						return false;
				} else {
					if(cnt[i]!=2)
						return false;
				}
			} else {
				if(cnt[i]<2)
					return false;
			}
		}
		
		return true;
	}
}
