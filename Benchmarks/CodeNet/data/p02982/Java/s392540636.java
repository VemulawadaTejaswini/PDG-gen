import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		Set<Integer>  set = new HashSet<Integer>();
		for (int i=1;i<1000;i++) {
			set.add(i*i);
		}
		int count =0;
		int a[][] = new int[N][D];
		for (int i=0;i<N;i++) {
			for (int j=0;j<D;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				int temp =0;
				for (int k=0;k<D;k++) {
					temp +=(a[i][k]-a[j][k])*(a[i][k]-a[j][k]);
				}
				if(set.contains(temp)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}