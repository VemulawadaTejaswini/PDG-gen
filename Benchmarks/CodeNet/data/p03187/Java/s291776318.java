import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        int n = sc.nextInt();
        long[] x = new long[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextLong();
        }
        sc.close();
        long ans = Math.max(x[n-1], l - x[1]);

        for(int i=1; i<n-1; i++){
            long mans = 0;
            int mr = i;
            int ml = i+1;
            boolean pos = true;
            while(mr != -1 && ml != n){
                mans += x[mr] + (l - x[ml]);
                if(pos){
                    mr--;
                }else{
                    ml++;
                }
                pos = !pos;
            }
            if(pos){
                mans += x[mr];
            }else{
                mans += l - x[ml];
            }
            ans = Math.max(ans, mans);

            mans = 0;
            mr = i;
            ml = i+1;
            pos = false;
            while(mr != -1 && ml != n){
                mans += x[mr] + (l - x[ml]);
                if(pos){
                    mr--;
                }else{
                    ml++;
                }
                pos = !pos;
            }
            if(pos){
                mans += x[mr];
            }else{
                mans += l - x[ml];
            }
            ans = Math.max(ans, mans);
        }

        System.out.println(ans);
    }
}