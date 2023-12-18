import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);


//		long n = sc.nextLong();
		int n = sc.nextInt();
		long m = sc.nextLong();
		int v = sc.nextInt();
		int p = sc.nextInt();
//		int m = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];
//		int[] ans = new int[n];
//		int[] a = new int[n];
		long[] a = new long[n];
		long[] tmpa = new long[n];
		long[] tmpb = new long[n];
//		Map<Integer, Long> aMap = new HashMap<>();
//		Map<Integer, Long> tmpMap = new HashMap<>();

//		aMap.clear();
//		tmpMap.clear();

//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			tmpa[i] = 0;
			tmpb[i] = 0;
//			aMap.put(i, sc.nextLong());
		}

		Arrays.sort(a);
		System.arraycopy(a,0,tmpa,0,n);
		System.arraycopy(a,0,tmpb,0,n);

//		int amari = (int) m % n;
//		long wari = (m / n) + 1;
		int index = 0;
		int count = 0;
		int forcount = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.clear();

		for(int i = 0; i < n/v; i++) {
			for(int j =index; j < index +v; j++) {
				tmpa[j] = tmpa[j] + m;
				tmpb[j] = tmpb[j] + m;
			}
			Arrays.sort(tmpa);
//			for(int k=0; k < n; k++) {
//				System.out.println("tmpa = " + tmpa[k] + " tmpb = " + tmpb[k]);
//			}

			for(int j =index; j < index +v; j++) {
				System.err.println("tmpa = " + tmpb[j] + " tmpb = " + tmpa[n-p]+ " j = " + j);
				if(tmpb[j] < tmpa[n-p]) {
					count++;
					if(!list.contains(j)) {
						list.add(j);
					}
				}
			}
//			System.err.println(count);
			if(count != v) {
				break;
			}
			forcount++;
			System.arraycopy(a,0,tmpa,0,n);
			System.arraycopy(a,0,tmpb,0,n);
			count = 0;
			index = index+v;
			if(index > n) {
				index = n;
			}
		}

		ans = n - list.size();

		System.out.println(ans);

		sc.close();
	}


}