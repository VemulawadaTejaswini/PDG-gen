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
		int cnt = selectionSort(a);
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
	
	public static int selectionSort(int[] a){
		int n = a.length, ret = 0;
		for(int i = 0; i < n; ++i){
			int minidx = i;
			for(int j = i; j < n; ++j){
				if(a[j] < a[minidx]) minidx = j;
			}
			if(i != minidx){
				++ret;
				{//swap(a[i], a[minidx])
					a[i] ^= a[minidx];
					a[minidx] ^= a[i];
					a[i] ^= a[minidx];
				}
			}
		}
		return ret;
	}
}

