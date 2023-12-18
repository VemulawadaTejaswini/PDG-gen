import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] p = new int[w];
		int[] q = new int[h];
		long[] psum = new long[w];
		long ans = 0;
		for(int i=0; i<w; i++){
			p[i] = sc.nextInt();
			ans += p[i];
		}
		for(int i=0; i<h; i++){
			q[i] = sc.nextInt();
			ans += q[i];
		}
		sc.close();
		
		Arrays.sort(p);
		long sum = 0;
		for(int i=0; i<w; i++){
			sum += p[i];
			psum[i] = sum;
		}
		
		for(int i=0; i<h; i++){
			int result = Arrays.binarySearch(p, q[i]) + 1;
			int pos = (result >= 0) ? result : -result;
			ans += (w-pos) * q[i];
			if(pos != 0){
				ans += psum[pos-1];
			}
		}
		System.out.println(ans);
	}

}