import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long[] x = new long[N];
		long[] y = new long[N];
    	for(int i = 0; i < N; i++){
    		x[i] = sc.nextLong();
			y[i] = sc.nextLong();
    	}
    	
		long maxZ = Long.MIN_VALUE;
		long minZ = Long.MAX_VALUE;
		long maxW = Long.MIN_VALUE;
		long minW = Long.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			long z = x[i] + y[i];
			long w = x[i] - y[i];
			
			if (maxZ < z) {
			    maxZ = z;
			}
			if (z < minZ) {
			    minZ = z;
			}
			if (maxW < w) {
			    maxW = w;
			}
			if (w < minW) {
			    minW = w;
			}
		}
        
		System.out.println(Math.max(maxZ - minZ, maxW - minW));
	}
}