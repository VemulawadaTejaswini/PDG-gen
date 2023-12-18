import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        long MOD = 7 + (long)1e9;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> primelist = new ArrayList<Integer>(10000);
        for(int i = 2 ; i < 1_000_000 ; i++){
            boolean isP = true;
            int sq = (int)Math.sqrt(i);
            for(int k = 2 ; k <= sq ; k++){
                if((i%k) == 0){
                    isP = false;
                    break;
                }
            }
            if(isP){
                primelist.add(i);
            }
        }

        int[] a = new int[10000];
        for(int i= 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int[] m = new int[100000];
        for(int i = 0 ; i < n ; i++){
            int tar = a[i];
            int p = 0;
            while(tar > 1){
                int pT = 0;
                int pNow = primelist.get(p);
                while((tar%pNow) == 0){
                    pT++;
                    tar /= pNow;
                }
                if(m[p] < pT){
                    m[p] = pT;
                }

                p++;
            }
        }

        long ans = 0;
        for(int i = 0 ; i < n ; i++){
            int tar = a[i];
            int p = 0;
            long b = 1;
            while(tar > 1){
                int pT = 0;
                int pNow = primelist.get(p);
                while((tar%pNow) == 0){
                    pT++;
                    tar /= pNow;
                }
                long mul = 1;
                while(pT < m[p]){
                    mul = (mul*pNow) % MOD;
                    pT++;
                }

                b = (b * mul) % MOD;
                p++;
            }
            for(; p < primelist.size() ; p++){
                long mul = 1;
                int pNow = primelist.get(p);
                for(int k = 0 ; k < m[p] ; k++){
                    mul = (mul*pNow) % MOD;
                }

                b = (b * mul) % MOD;
            }
            ans = (ans + b) % MOD;
        }

        System.out.println(ans);
    }
}