import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N],b = new int[N];
		int i,k,bsum = 0;
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(i = 0;i < N;i ++) {
			a[i] = sc.nextInt(); b[i] = sc.nextInt();
			for(k = 0;k < b[i];k++) {
				r.add(a[i]);
			}
		}
		
		/*for(i = 0;i < N;i ++) {
			for(k = 0;k < b[i];k++) {
				r.add(a[i]);
				//System.out.println(r);
			}
		}*/
		//System.out.println(r);
		System.out.println(r.get(K-1));
	}
	
}