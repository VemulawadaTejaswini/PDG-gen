import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(sc.next());
		sc.close();
		int cnt = bubbleSort(a);
		printArray(a);
		System.out.println(cnt);
	}
	
	public static void printArray(int[] a){
		int n = a.length;
		for(int i = 0; i < n; ++i){
			if(i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static int bubbleSort(int[] a){
		int n = a.length, ret = 0;
		boolean flag = true;
		for(int i = 0; flag && (i < n); ++i){
			flag = false;
			for(int j = n-1; j > i; --j){
				if(a[j-1] > a[j]){
					{//swap(a[j-1], a[j]の代わり
						a[j-1] ^= a[j];
						a[j] ^= a[j-1];
						a[j-1] ^= a[j];
					}
					flag = true; ++ret;
				}
			}
		}
		return ret;
	}
}

