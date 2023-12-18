import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long G = sc.nextLong() / 100;
        int[] p = new int[d], g = new int[d], max = new int[d];
        int k = (int)Math.pow(2, d);
        for(int i = 0; i < d; i++){
            p[i] = sc.nextInt();
            g[i] = sc.nextInt() / 100;
            max[i] = (i + 1) * p[i] + g[i];
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            long gg = G;
            String kk = to2(i, d);
            int tmp = 0;
            int min = -1;
            for(int j = 0; j < d; j++){
                if(kk.charAt(j) == '1'){
                    gg -= max[j];
                    tmp += p[j];
                }else{
                    min = j;
                }
            }
            if(min >= 0 && 0 <= gg && gg < max[min]){
                tmp += Math.min(gg / (min + 1), p[min] - 1);
            }
            System.out.println(kk + " " + tmp);
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