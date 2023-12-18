import java.util.*;

public class Main{
    static long sum = 0;
    static long X;
    static int[] a;
    static String S;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        S = sc.next();
        sc.close();

        X = Long.parseLong(S);
        a = new int[S.length()];

        dps(0, 0);

        System.out.println(sum);

    }
    static void dps(int pos, int val){
        a[pos] = val;
        if(pos == S.length()-1){
            long y = X;
            long sum_p = 0;
            for(int i = S.length()-1; i >= 0; i--){
                if(a[i] == 1){
                    sum_p += y/(int)(Math.pow(10, i));
                    y -= y/(int)(Math.pow(10, i)) * (int)(Math.pow(10, i));
                }
            }
            sum += sum_p+y;
        } else{ 
            dps(pos+1, 1);
            dps(pos+1, 0);
        }
    }
}