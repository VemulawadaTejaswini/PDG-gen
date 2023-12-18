import java.util.*;
public class Main {
    static int A,B,C,D,E,F;
    static int a;
    static int b;
    static double e;
    static int MaxW, MaxS;
    public static void Max(int W, int S, double P){
        double prep = P;
        int M = 0;
        int M1, M2, M3;
        M1 = W + C + D + S;
        M2 = W + D + S;
        M3 = W + C + S;
        if(M<=F && (double)(S+C+D)/(double)M1<=e){
            MaxW = M1;
            MaxS = C + D + S;
            P = (double)(S+C+D)/(double)M1;
        } else if(M<=F && (double)(S+D)/(double)M2<=e){
            MaxW = M2;
            MaxS = S + D;
            P = (double)(S+D)/(double)M2;
        } else if(M<=F && (double)(S+C)/(double)M3<=e){
            MaxW = M3;
            MaxS = S + C;
            P = (double)(S+C)/(double)M3;
        } else {

            M = W + a + C + S;
            if (M <= F) {
                if (((double) (S + C) / (double) M) <= e && ((double) (S + C) / (double) M) > P) {
                    MaxW = M;
                    MaxS = C + S;
                    P = (double) (S + C) / (double) M;
                }
            }
            M = W + a + D + S;
            if (M <= F) {
                if (((double) (S + D) / (double) M) <= e && ((double) (S + D) / (double) M) > P) {
                    MaxW = M;
                    MaxS = D + S;
                    P = (double) (S + D) / (double) M;
                }
            }
            M = W + a + C + D + S;
            if (M <= F) {
                if ((double) (S + C + D) / (double) M <= e && (double) (S + C + D) / (double) M > P) {
                    MaxW = M;
                    MaxS = C + D + S;
                    P = (double) (S + C + D) / (double) M;
                }
            }
            M = W + b + C + S;
            if (M <= F) {
                if (((double) (S + C) / (double) M) <= e && ((double) (S + C) / (double) M) > P) {
                    MaxW = M;
                    MaxS = C + S;
                    P = (double) (S + C) / (double) M;
                }
            }
            M = W + b + D + S;
            if (M <= F) {
                if ((double) (S + D) / (double) M <= e && (double) (S + D) / (double) M > P) {
                    MaxW = M;
                    MaxS = D + S;
                    P = (double) (S + D) / (double) M;
                }
            }
            M = W + b + C + D + S;
            if (M <= F) {
                if ((double) (S + C + D) / (double) M <= e && (double) (S + C + D) / (double) M > P) {
                    MaxW = M;
                    MaxS = C + D + S;
                    P = (double) (S + C + D) / (double) M;
                }
            }
            M = W + a + b + C + S;
            if (M <= F) {
                if ((double) (S + C) / (double) M <= e && (double) (S + C) / (double) M > P) {
                    MaxW = M;
                    MaxS = C + S;
                    P = (double) (S + C) / (double) M;
                }
            }
            M = W + a + b + D + S;
            if (M <= F) {
                if ((double) (S + D) / (double) M <= e && (double) (S + D) / (double) M > P) {
                    MaxW = M;
                    MaxS = D + S;
                    P = (double) (S + D) / (double) M;
                }
            }
            M = W + a + b + C + D + S;
            if (M <= F) {
                if ((double) (S + C + D) / (double) M <= e && (double) (S + C + D) / (double) M > P) {
                    MaxW = M;
                    MaxS = C + D + S;
                    P = (double) (S + C + D) / (double) M;
                }
            }
        }
        if(prep!=P) {
            Max(MaxW - MaxS, MaxS, P);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        a = 100 * A;
        B = sc.nextInt();
        b = 100 * B;
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();
        e = (double)E/(100.0 + (double)E);
        F = sc.nextInt();
        Max(0,0,0.0);
        System.out.println(MaxW + " " + MaxS);

    }

}
