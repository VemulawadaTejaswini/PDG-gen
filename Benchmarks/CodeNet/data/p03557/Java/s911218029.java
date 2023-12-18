import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	double[] a = new double[n];
    	int[] b = new int[n];
    	double[] c = new double[n];
    	Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
    	Arrays.setAll(b, i -> Integer.parseInt(sc.next()));
    	Arrays.setAll(c, i -> Integer.parseInt(sc.next()));
    	Arrays.sort(a);
    	Arrays.sort(b);
    	Arrays.sort(c);
    	long ans = 0;
    	for(int i = 0; i < n; i++) {
    		int idxA = ~Arrays.binarySearch(a, b[i] - 0.1);
    		if(idxA < 0) continue;
    		long A = idxA;
    		
    		int idxC = ~Arrays.binarySearch(c, b[i] + 0.1);
    		if(idxC < 0) continue;
    		long C = n - idxC;
    		
    		ans += A*C;
    	}
    	System.out.println(ans);
    }
}
