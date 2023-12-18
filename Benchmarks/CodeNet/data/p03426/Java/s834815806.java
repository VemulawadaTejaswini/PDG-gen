import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int h, w, d, q, l, r;
		h = sc.nextInt();
		w = sc.nextInt();
		d = sc.nextInt();
		
		int[] px = new int[h * w + 1];
		int[] py = new int[h * w + 1];
		int[] m  = new int[h * w + 1];
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				int a = sc.nextInt();
				px[a] = i;
				py[a] = j;
			}
		}
		for(int i = d + 1; i < h * w; i++){
			m[i] = m[i-d] + Math.abs(px[i] - px[i - d]) + Math.abs(py[i] - py[i - d]);
		}
		q = sc.nextInt();
		
		for(int i = 0; i < q; i++){
			l = sc.nextInt();
			r = sc.nextInt();
			System.out.println(m[r] - m[l]);
		}
	}
}
