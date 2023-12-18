//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[] = new int [N];
		int A[][] = new int [M][2];
		
		for(int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		boolean ok[] = new boolean[N];
		Arrays.fill(ok,true);
		
		int a,b;
		for(int j=0;j<M;j++) {
			a = sc.nextInt()-1;
			b = sc.nextInt()-1;
			if(H[a] == H[b]) {
				ok[a] = false;
				ok[b] = false;
			}else if(H[a]>H[b]) {
				ok[b] = false;
			}else {
				ok[a] = false;
			}
		}
		int count = 0;
		for(int k=0;k<N;k++) {
			if(ok[k]) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
}