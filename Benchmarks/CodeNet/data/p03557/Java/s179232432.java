import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		//int K = in.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
		for(int i=0; i<N; i++) {
			b[i] = in.nextInt();
		}
		for(int i=0; i<N; i++) {
			c[i] = in.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int count = 0;
		for(int ai=0; ai<N; ai++) {
			for(int bi=0; bi<N; bi++) {
				if(a[ai] < b[bi]) {
					
					for(int ci=0; ci<N; ci++) {
						if(b[bi] < c[ci]) {
							count += N-ci;
							break;
						}
					}
				}
			}
		}
		System.out.println(count);
		
		
		in.close();
	}
}
