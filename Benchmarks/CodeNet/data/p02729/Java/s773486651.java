package atcoder_ABC_D;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			int[][]B = new int[N][N];
			int[]K = new int[N];//値
			for(int i= 0;i<N;i++) {
				A[i] = scan.nextInt();
			}
			
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			
			for(int i = 0;i<N;i++) {
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
					//System.out.println("ok");
				}else{
					map.put(A[i], 1);
					//System.out.println("no");
				}
			}
			
			/*for(Integer key:map.keySet()) {
				System.out.println(key);
				System.out.println(map.get(key));
			}*/
			//int n = 1_000_000; //n=100万まで求めるとする
	        //pre_factorials(n); //1!からn!までの値を持った配列を準備する    
			
			
			for(int i= 0;i<N;i++) {
				int goukei =0;
				if(map.get(A[i])>1) {
				
				for(Integer key:map.keySet()) {
					if(map.get(key)>1)
						goukei+=sa(map.get(key),2);
				}
				
				goukei-=sa(map.get(A[i])-1,1);
				
				System.out.println(goukei);
				}else {
					for(Integer key:map.keySet()) {
						if(map.get(key)>1)
							goukei+=sa(map.get(key),2);
					}
					System.out.println(goukei);
				}
				
				
					
				
				
			}
			
			
			
			
			
			
			
		}
		
		
	}
	
	private static int sa(int n,int b) {
		return n*(n-1)/2;
	}
	/*
	//Fast Fermat Combination
    static int mod = (int) 1e9 + 7;
    static long factorials[]; //事前に階乗計算の結果を格納しておく配列

    static void pre_factorials(int n) { //0!〜n!まで求めておく
        factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 0; i < n; i++) {
            factorials[i + 1] = (long)(i + 1) * factorials[i] % mod;
        }
    }

    static long fastFermatComb(long a, long b) {
        if (factorials.length == 0)
            System.err.println("error : factorials has not been culculated!! do [pre_factorials] method");
        long af = factorials[(int) a];
        long bf = factorials[(int) b];
        long abf = factorials[(int) (a - b)];
        long res = af * modpow(bf, mod - 2) % mod * modpow(abf, mod - 2) % mod;
        return res;
    }

    //mod条件下の高速pow
    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long root = modpow(a, p / 2);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }
*/
	
	
		

}
