import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        sc.close();

        long[] lr = new long[n];
        long[] rl = new long[n];
        lr[0] = 0;
        rl[n-1] = 0;
        rl[n-2] = 1;
        for(int i=1; i<n; i++){
            if(a[i] == a[i-1]){
                lr[i] = lr[i-1];
            }else if(a[i] < a[i-1]){
                lr[i] = lr[i-1] + culcMult4(a[i], a[i-1]);
            }else{
                lr[i] = Math.max(0, lr[i-1] - culcMult42(a[i-1], a[i]));
            }
        }
        for(int i=n-3; i>=0; i--){
            if(a[i] == a[i+1]){
                rl[i] = rl[i+1];
            }else if(a[i] < a[i+1]){
                rl[i] = rl[i+1] + culcMult4(a[i], a[i+1]);
            }else{
                rl[i] = Math.max(1, rl[i+1] - culcMult42(a[i+1], a[i]));
            }
        }

        long[] slr = new long[n];
        long[] srl = new long[n];

        slr[n-1] = lr[n-1];
        srl[0] = rl[0];
        for(int i=1; i<n; i++){
            slr[n-i-1] = slr[n-i] + lr[n-i-1];
            srl[i] = srl[i-1] + rl[i];
        }

        int tw = 20;
        int[][] smlr = new int[n][tw];
        int[][] smrl = new int[n][tw];

        long[] ans = new long[n];
        ans[0] = slr[0];
        long min = ans[0];
        int minpos = 0;
        ans[n-1] = srl[n-1];
        if(ans[n-1] < min){
            min = ans[n-1];
            minpos = n-1;
        }
        for(int i=1; i<n-1; i++){
            long mans = 0;
            mans += slr[i] - (lr[i] * n-i);
            mans += srl[i-1] - (rl[i-1] * i);
            ans[i] = mans;
            if(mans < min){
                min = mans;
                minpos = i;
            }
        }

        // System.out.println(Arrays.stream(ans).min().getAsLong());

        long ans2 = 0;
        if(minpos == 0 || minpos == n-1){
            ans2 = ans[minpos];
        }else{
            int pn4 = 0;
            for(int i=minpos+1; i<n; i++){
                if(a[i] == a[i-1]){
                    ans2 += pn4;
                }else if(a[i] < a[i-1]){
                    long tmp = culcMult4(a[i], a[i-1]);
                    ans2 += pn4 + tmp;
                    pn4 += tmp;
                }else{
                    long tmp = Math.max(0, pn4 - culcMult42(a[i-1], a[i]));
                    ans2 += tmp;
                    pn4 = (int)tmp;
                }
            }
            pn4 = 1;
            ans2++;
            for(int i=minpos-2; i>=0; i--){
                if(a[i] == a[i+1]){
                    ans2 += pn4;
                }else if(a[i] < a[i+1]){
                    long tmp = culcMult4(a[i], a[i+1]);
                    ans2 += pn4 + tmp;
                    pn4 += tmp;
                }else{
                    long tmp = Math.max(1, pn4 - culcMult42(a[i+1], a[i]));
                    ans2 += tmp;
                    pn4 = (int)tmp;
                }
            }
        }
        System.out.println(ans2);
    }

    static long culcMult4(long s, long l){
        long ans = 0;
        while(s < l){
            s *= 4;
            ans++;
        }
        return ans * 2;
    }

    static long culcMult42(long s, long l){
        long ans = 0;
        while(s <= l){
            s *= 4;
            ans++;
        }
        return (ans-1) * 2;
    }
}