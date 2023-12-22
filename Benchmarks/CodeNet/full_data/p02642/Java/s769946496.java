import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int count =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i=0;i<N;i++) {
			set.add(A[i]);
		}
		Arrays.sort(A);
		for (int i=0;i<N;i++) {
			if (i==0) {
				if (A[0]==A[1]) {
					continue;
				}
			} else if (i==N-1) {
				if (A[i]==A[i-1]) {
					continue;
				}
			} else {
				if (A[i]==A[i-1]||A[i]==A[i+1]) {
					continue;
				}
			}
			boolean b = false;
			for (int j=2;j*j<=A[i];j++) {
				if (A[i]%j==0) {
					if (set.contains(A[i]/j)||set.contains(j)) {
						b = true;
						break;
					}
				}
			}
			if (b==false) {
				count++;
			}
		}
		System.out.println(count);
	}
}