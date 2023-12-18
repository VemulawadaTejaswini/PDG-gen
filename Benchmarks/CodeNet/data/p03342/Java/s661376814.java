import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        BitSet[] bs = new BitSet[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            bs[i] = new BitSet(25);
            int tmp = a[i];
            for(int j=24; j>=0; j--){
                int pow = (int)Math.pow(2, j);
                if(tmp >= pow){
                    bs[i].set(j);
                    tmp -= pow;
                }
            }
        }
        sc.close();

        long ans = n;

        int l=0, r = 1;
        BitSet cbs = (BitSet)bs[0].clone();

        while(true){
            BitSet tmp = (BitSet)cbs.clone();
            tmp.and(bs[r]);
            if(tmp.cardinality() == 0){
                ans += r - l;
                cbs.or(bs[r]);
                r++;                
            }else{
                cbs.xor(bs[l]);
                l++;
            }
            if(l == r){
                cbs = (BitSet)bs[r].clone();
                r++;
            }            
            if(r == n) break;
        }

        // boolean flag = false;
        
        // while(true){
        //     BitSet tmp = (BitSet)cbs.clone();
        //     tmp.and(bs[r]);
        //     if(tmp.cardinality() == 0){
        //         if(flag){
        //             ans += r-l;
        //             flag = false;
        //         }else{
        //             ans++;
        //         }
        //         cbs.or(bs[r]);
        //         r++;                
        //     }else{
        //         cbs.xor(bs[l]);
        //         l++;
        //         flag = true;
        //     }
        //     if(l == r){
        //         cbs = (BitSet)bs[r].clone();
        //         r++;
        //         flag = false;
        //     }            
        //     if(r == n) break;
        // }
        // ans += (n - l)*(n-l - 1) / 2 - (n-l-1);

        System.out.println(ans);
    }
}