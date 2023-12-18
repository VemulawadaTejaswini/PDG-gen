import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		Long[] A = new Long[X];
		Long[] B = new Long[Y];
		Long[] C = new Long[Z];
		List<Long> ABC = new ArrayList<Long>();
		for (int i=0;i<X;i++) {
			A[i]=Long.parseLong(sc.next());
		}
		Arrays.sort(A,Comparator.reverseOrder());
		for (int i=0;i<Y;i++) {
			B[i]=Long.parseLong(sc.next());
		}
		Arrays.sort(B,Comparator.reverseOrder());
		for (int i=0;i<Z;i++) {
			C[i]=Long.parseLong(sc.next());
		}
		Arrays.sort(C,Comparator.reverseOrder());
		int n=0;
		for (int i=0;i<X;i++) {
			for (int j=0;j<Y;j++) {
					for (int k=0;k<Z;k++) {
						if ((i+1)*(j+1)*(k+1)<=K) {
							ABC.add(A[i]+B[j]+C[k]);
							n++;
						} else {
							break;
						}
					}
			}
		}
		Collections.sort(ABC,Comparator.reverseOrder());

		for (int i=0;i<K;i++) {
			System.out.println(ABC.get(i));
		}
	}
}