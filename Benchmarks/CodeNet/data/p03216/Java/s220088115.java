import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int q = sc.nextInt();
        int[] k = new int[q];
        for(int i=0; i<q; i++){
            k[i] = sc.nextInt();
        }
        sc.close();

        boolean[] pd = new boolean[n];
        boolean[] pm = new boolean[n];
        boolean[] pc = new boolean[n];
        int[] sumd = new int[n+1];
        int[] summ = new int[n+1];
        int[] sumc = new int[n+1];
        for(int i=0; i<n; i++){
            sumd[i+1] = sumd[i];
            summ[i+1] = summ[i];
            sumc[i+1] = sumc[i];
            if(s.charAt(i) == 'D'){
                pd[i] = true;
                sumd[i+1]++;
            }else if(s.charAt(i) == 'M'){
                pm[i] = true;
                summ[i+1]++;
            }else if(s.charAt(i) == 'C'){
                pc[i] = true;
                sumc[i+1]++;
            }
        }

        long[] score = new long[n+1];
        for(int i=n-2; i>=0; i--){
            score[i] = score[i+1];
            if(pm[i]){
                score[i] += sumc[n] - sumc[i];
            }
        }

        for(int i=0; i<q; i++){
            long ans = 0;
            for(int j=0; j<n; j++){
                if(!pd[j]) continue;
                int end = Math.min(j+k[i]-1, n-1);
                ans += score[j];
                ans -= score[end+1];
                ans -= (long)(summ[end+1]-summ[j]) * (long)(sumc[n] - sumc[end+1]);
            }
            System.out.println(ans);
        }
    }

}