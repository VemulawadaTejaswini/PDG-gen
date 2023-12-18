import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int[] p = new int[w];
		int[] q = new int[h];
		for(int i = 0; i < w; ++i)
			p[i] = scanner.nextInt();
		for(int i = 0; i < h; ++i)
			q[i] = scanner.nextInt();
		Arrays.sort(p);
		Arrays.sort(q);
		int r = 0, c = 0;
		int wi = 0, hi = 0;
		int cost = 0;
		for(int i = 0; i < (w+1) * (h+1) - 1; ){
			if(wi == w){
				int num = w+1-r;
				cost += q[hi] * num;
				break;
			}
			if(hi == h){
				int num = h+1-c;
				cost += p[wi] * num;
				break;
			}
			if(p[wi] < q[hi]){
				int num = h+1-c;
				cost += p[wi] * num;
				i += num;
				r++;
				wi++;
			}else{
				int num = w+1-r;
				cost += q[hi] * num;
				i += num;
				c++;
				hi++;
			}
		}
		System.out.println(cost);
		scanner.close();
	}

}
