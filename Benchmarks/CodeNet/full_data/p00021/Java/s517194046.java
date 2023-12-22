import java.util.*;
import static java.lang.Math.*;
class Main {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0) {
			double[] A = new double[]{in.nextDouble(), in.nextDouble()};
			double[] B = new double[]{in.nextDouble(), in.nextDouble()};
			double[] C = new double[]{in.nextDouble(), in.nextDouble()};
			double[] D = new double[]{in.nextDouble(), in.nextDouble()};
			double dist1 = pow(A[0] - C[0],2) + pow(A[1] - C[1],2);
			double dist2 = pow(B[0] - D[0],2) + pow(B[1] - D[1],2);
			System.out.println(dist1==dist2?"YES":"NO");
		}
	}
}