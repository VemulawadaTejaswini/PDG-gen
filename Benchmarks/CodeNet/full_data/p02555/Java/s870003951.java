import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        long res=0;
        int x=S/3;

        if(S%3==0){
            for(int i=0; i<x; i++){
                res = (res + fermatComb(3*i+x-i-1,x-i-1))%((long)Math.pow(10,9) + 7);
            }
        }else if(S%3==1){
            for(int i=0; i<x; i++){
                res = (res + fermatComb(3*i+x-i,x-i-1))%((long)Math.pow(10,9) + 7);
            }
        }else{
            for(int i=0; i<x; i++){
                res = (res + fermatComb(3*i+x-i+1,x-i-1))%((long)Math.pow(10,9) + 7);
            }
        }

        
        
        System.out.println(res);
        
        }

    
    static long mod = (long)Math.pow(10,9) + 7;
    static long fermatComb(long a, long b) {
        if (b > a - b)
            return fermatComb(a, a - b);
        long mul = 1; //分子
        long div = 1; //分母
        for (int i = 0; i < b; i++) {
            mul *= (a - i);
            mul %= mod;
            div *= (i + 1);
            div %= mod;
        }
        long ans = mul * modpow(div, mod - 2) % mod; //フェルマーの小定理を利用して掛け算で計算
        return ans;
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
    }