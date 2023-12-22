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
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> repeat = new HashSet<Integer>();
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (set.contains(A[i])) {
				repeat.add(A[i]);
			}
			set.add(A[i]);
		}
		Arrays.sort(A);
		for (int i=0;i<N;i++) {
			if (repeat.contains(A[i])) {
				continue;
			}
			boolean b = false;
			if (A[i]==2) {
				if (set.contains(1)==true) {
					continue;
				}
			}
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