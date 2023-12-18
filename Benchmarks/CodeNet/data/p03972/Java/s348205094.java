
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] p,q;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		p = new int[w];
		q = new int[h];
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
		
		for(int i=0; i<h; i++){
			int result = Arrays.binarySearch(p, q[i]) + 1;
			int pos = (result >= 0) ? result : -result;
			ans += (w-pos) * q[i];
			for(int j=0; j<pos; j++){
				ans += p[j];
			}
		}
		System.out.println(ans);
	}

}
