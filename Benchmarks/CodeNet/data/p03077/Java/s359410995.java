import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] tp = new long[5];
        for (int i = 0; i < tp.length; i++) {
            tp[i] = sc.nextInt();
        }
        long time = 0;
        long m = n;
        long limitOftp = tp[0];
        for (int i = 0; i < tp.length; i++) {
            time += m / limitOftp;
            if (m % limitOftp != 0) {
                time++;
                m %= limitOftp; 
            } else {
                m = limitOftp;
            }
            if (i < tp.length - 1) {
                if (limitOftp > tp[i + 1]) {
                    m += (limitOftp - tp[i + 1]) * (time - 1 - i);
                    limitOftp = tp[i + 1];
                }           
            }
        }
        System.out.println(time);
        sc.close();
    }
}