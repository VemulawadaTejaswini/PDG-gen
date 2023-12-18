import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), G = sc.nextInt() / 100;
        int[] p = new int[d], g = new int[d], max = new int[d],
              k = new int[(int)Math.pow(2, d)];
        for(int i = 0; i < d; i++){
            p[i] = sc.nextInt();
            g[i] = sc.nextInt() / 100;
            max[i] = (i + 1) * p[i] + g[i];
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < k.length; i++){
            int gg = G;
            String kk = to2(i, d);
            long tmp = 0;
            int min = -1;
            for(int j = 0; j < d; j++){
                if(kk.charAt(j) == '1'){
                    gg -= max[j];
                    tmp += p[j];
                }else{
                    min = j;
                }
            }
            if(min >= 0 && 0 <= gg && gg <= max[min]){
                if(gg < (min + 1) * p[min]) tmp += gg / (min + 1);
                else tmp += p[min];
            }
            else tmp = Long.MAX_VALUE;
            if(tmp > 0)
                ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
    static String to2 (int m, int d){
        String ans = "";
        for(int i = 0; i < d; i++){
            if(m % 2 == 0){
                m /= 2;
                ans = "0" + ans;
            }
            else{
                m--;
                m /= 2;
                ans = "1" + ans;
            }
        }
        return ans;
    }
}