import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        int ns = 66;
        String kbit = String.format("%" + ns + "s", Long.toBinaryString(k)).replace(' ', '0');
        String[] abit = new String[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            abit[i] = String.format("%" + ns + "s", Long.toBinaryString(a[i])).replace(' ', '0');
        }
        sc.close();

        long ans = 0;
        for(int l=1; l<35; l++){
            long mans = 0;
            String mkbit;
            if(kbit.charAt(ns - l) == '1'){
                mkbit = kbit.substring(0, ns-l);
                mkbit += "0";
                for(int m=0; m<l-1; m++){
                    mkbit += "1";
                }
            }else{
                mkbit = kbit;
            }
            out:
            for(int i=0; i<n; i++){
                for(int j=0; j<ns; j++){
                    if(mkbit.charAt(j) == '0' && abit[i].charAt(j) == '1'){
                        continue out;
                    }
                }
                mans += b[i];
            }
            ans = Math.max(mans, ans);
        }

        System.out.println(ans);
    }
}