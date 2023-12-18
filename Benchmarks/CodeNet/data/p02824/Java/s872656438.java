
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		int p = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		//reverse
		int[] b = new int[n];
		for (int i=0;i<n;i++) {
			b[i]=a[n-1-i];
		}
		a=b;

		//first appearance
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i=0;i<n;i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], i);
			}
		}

		//ruisekiwa
		long[] c = new long[n+1];

		for (int i=0;i<n;i++) {
			c[i+1]=c[i]+a[i];
		}

		int left = 0;
		int right = n;

		/*
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));

		for(int i=0;i<n;i++) {
			System.out.println(isLegal(a,i,map,c,n,m,v,p));
		}
		 */
		while (right-left>1) {
			int mid = (left+right)/2;


			if (isLegal(a,mid,map,c,n,m,v,p)) {
				left=mid;
			} else {
				right=mid;
			}
		}
		System.out.println(right);
	}

	public static boolean isLegal(int[]a, int pos, TreeMap<Integer,Integer> map, long[]c,
			int n, int m, int v, int p) {

		int allVote = p-1 + n-map.get(a[pos]);

		if (map.floorEntry(a[pos]+m).getValue()>=p) {
//			System.out.println("bunki1");
			return false;
		}

		if (allVote>=v) {
//			System.out.println("bunki2");
			return true;
		} else {
			long fM = ((long)(n-allVote)*(a[pos]+m)-(c[map.get(a[pos])]-c[p-1]))/m;
			if (fM >= v-allVote) {
//				System.out.println("bunki3");
				return true;
			} else {
//				System.out.println("bunki4");
				return false;
			}
		}
	}
}
