

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[202020], B[] = new int[202020];
		boolean Bi[] = new boolean[32];
		for(int i = 0;i < N;++i){
			int t;
			t = sc.nextInt();
			A[i] = t;
		}
		for(int i = 0;i < N;++i){
			int t;
			t = sc.nextInt();
			B[i] = t;
		}
		
		for(int i = 0;i < N;++i){
			int a = A[i];
			for(int j = 0;j < N;++j){
				int b = B[j];
				int t = a + b;
				String s = String.format("%32s", Integer.toBinaryString(t)).replaceAll(" ", "0");
				for(int k = 0;k < 32;++k){
					if(s.charAt(k) == '1'){
						Bi[31-k] = !Bi[31-k];
						
					}
				}
			}
		}
		
		int ret = 0;
		for(int k = 0;k < 32;++k){
			if(Bi[k]){
				ret += Math.pow(2, k);
			}
		}
		
		System.out.println(ret);
	}
}
