import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		boolean[] hoge = new boolean[N];
		for(int i = 0; i < N; i++) {
			hoge[i] = true;
		}
		for(int i = 0; i < M; i++) {
			hoge[a[i]] = false;
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			boolean[] nex = new boolean[N >> (i+1)];
			
			if(nex.length == 0) break;
			for(int k = 0; k < hoge.length; k += 2) {
				if(hoge[k] && hoge[k+1]) {
					nex[k / 2] = true;
					sum++;
				}
				else if(!hoge[k] && hoge[k+1] || hoge[k] && !hoge[k+1]) {
					nex[k / 2] = true;
				}
			}
			hoge = nex;
		}
		System.out.println(sum);
	}
}