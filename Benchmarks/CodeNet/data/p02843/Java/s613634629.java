import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for(int a=1000; a>=0; a--) {
            int tmp_a = calc(X, a, 0, 0, 0, 0, 0);
            if(0>tmp_a) continue;
            for(int b=1000-a; b>=0; b--) {
                int tmp_b = calc(X, a, b, 0, 0, 0, 0);
                if(0>tmp_b) continue;
                for(int c=1000-(a+b); c>=0; c--) {
                    int tmp_c = calc(X, a, b, c, 0, 0, 0);
                    if(0>tmp_c) continue;
                    for(int d=1000-(a+b+c); d>=0; d--) {
                        int tmp_d = calc(X, a, b, c, d, 0, 0);
                        if(0>tmp_d) continue;
                        for(int e=1000-(a+b+c+d); e>=0; e--) {
                            int tmp_e = calc(X, a, b, c, d, e, 0);
                            if(0>tmp_e) continue;
                            for(int f=1000-(a+b+c+d+e); f>=0; f--) {
                                int tmp_f = calc(X, a, b, c, d, e, f);
                                if(0>tmp_f) continue;
                                if(0==tmp_f) {
                                    System.out.println(String.format("1"));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(String.format("0"));
    }
    static int calc(int X, int a, int b, int c, int d, int e, int f) {
        return X - (a*100+b*101+c*102+d*103+e*104+f*105);
    }
}
