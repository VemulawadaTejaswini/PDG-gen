import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];
		int p = 1100;
		int M = 0;
		for(int i = 0; i < N; i++){
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		M = N * T;
		for(int i = 0; i < N; i++){
			if((c[i] < N) && (t[i] < T)){
				if(c[i]*t[i] < M){
					p = c[i];
				}
			}
		}
		if(p == 1100){
			System.out.println("TLE");
		}else{
			System.out.println(p);
		}
	}
}