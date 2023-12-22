import java.util.*;
import java.math.*;

public class Main{
	private static int S,A,C;
	private static int[] I, Rmemo;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			I = new int[n];
			for(int i=0;i<n;i++) I[i] = sc.nextInt();

			double minH = Double.MAX_VALUE;
			int minS=-1, minA=-1, minC=-1;
			for(S=0;S<=15;S++){
				for(A=0;A<=15;A++){
					for(C=0;C<=15;C++){
						double H = 0.0;

						Rmemo = new int[258];
						Arrays.fill(Rmemo,-1);

						int[] count = new int[258];
						for(int i=1;i<=n;i++) count[O(i)]++;
						for(int x : count){
							if(x > 0)
								H -= (double)x / n * Math.log((double)x / n);
						}
						if(minH > H && Math.abs(minH-H) > 0.00001){
							minH = H;
							minS = S;
							minA = A;
							minC = C;
						}
					}
				}
			}

			System.out.println(minS + " " + minA + " " + minC);
		}
	}

	private static int O(int i){
		return (I[i-1] + R(i)) % 256;
	}

	private static int R(int i){
		if(i == 0) return S;
		if(Rmemo[i] != -1) return Rmemo[i];
		return Rmemo[i] = (A * R(i-1) + C) % 256;
	}
}