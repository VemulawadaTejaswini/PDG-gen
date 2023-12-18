import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0;i < N;i++) {
			long A = sc.nextLong();
			a[i] += A;
		}
			Arrays.parallelSort(a);		
			for(int j=0;j<N-1;j++) {
				if(a[j]-a[j+1]==0) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
	}
}