import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static int answer=Integer.MAX_VALUE;
 
	public static int N;
	public static int M;
	public static int X;
 
	public static int[] C;
	public static int[][] A;
 
	public static void main(String[] args) {
 
		int N = in.nextInt();
		long K = in.nextLong();
 
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = in.nextInt();
		}
 
		Set<Integer> set = new HashSet<>();
		int target = -1;
		int targetIdx = -1;
		int[] sorted = new int[N];
		sorted[0] = 1;
		set.add(sorted[0]);
		for(int i=1;i<N; i++) {
			int next = A[sorted[i-1]-1];
//			System.out.println(next);
			if(set.contains(next)) {
				target = next;
				targetIdx = i;
				break;
			}
			set.add(next);
			sorted[i] = next;
		}
 
//		System.out.println();
//		for(int i:sorted)System.out.println(i);
 
		int loopStart = -1;
		int loopEnd = targetIdx - 1;
		for(int i=0;i<N;i++) {
			if(sorted[i] == target) {
				loopStart = i;
			}
		}
 
//		System.out.println();
//		System.out.println(loopStart);
//		System.out.println(loopEnd);
//		System.out.println();
 
		long kIdx = K-1;
		if(kIdx < loopStart || loopStart == -1) {
			System.out.println(sorted[(int)kIdx]);
			return;
		}
 
		long idx1 = K - loopStart;
//		System.out.println(idx1);
		int idx = (int)(idx1 % (loopEnd - loopStart + 1));
		System.out.println(sorted[loopStart+idx]);
 
	}

 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}