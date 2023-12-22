import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double[] A = new double [2];
			double[] B = new double [2];
			double[] C = new double [2];
			double[] D = new double [2];
			
			A[0] = sc.nextDouble();  A[1] = sc.nextDouble();
			B[0] = sc.nextDouble();  B[1] = sc.nextDouble();
			C[0] = sc.nextDouble();  C[1] = sc.nextDouble();
			D[0] = sc.nextDouble();  D[1] = sc.nextDouble();
			
			double[] AB = {B[0]-A[0], B[1]-A[1]};
			double[] CD = {D[0]-C[0], D[1]-C[1]};
			double inner_product = AB[0]*CD[0] + AB[1]*CD[1]; 
			
			System.out.println(inner_product==0. ? "YES" : "NO");
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}