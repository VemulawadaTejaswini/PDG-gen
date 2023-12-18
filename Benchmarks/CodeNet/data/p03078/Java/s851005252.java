
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[X];
		long B[] = new long[Y];
		long C[] = new long[Z];
		for(int i=0;i<X;i++)A[i]=sc.nextLong();
		for(int i=0;i<Y;i++)B[i]=sc.nextLong();
		for(int i=0;i<Z;i++)C[i]=sc.nextLong();
		sc.close();
		
		Long ans[];
		try {
			ans = new Long[X*Y*Z];
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(0);
			return;
		}
		int cnt = 0;
		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
				for(int k=0;k<Z;k++) {
					ans[cnt]=A[i]+B[j]+C[k];
					cnt++;
				}
			}
		}
		
		Arrays.sort(ans, (a1,a2)->Long.compare(a2,a1));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<K;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb.toString());
	}
}
