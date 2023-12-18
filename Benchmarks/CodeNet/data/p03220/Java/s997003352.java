import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double T = sc.nextDouble();
        double A = sc.nextDouble();
        double[] H = new double[N];
        for(int i = 0; i < N; i++) H[i] = sc.nextDouble();
        int ans = 0;
        for(int i = 0; i < N; i++) {
            if(dif(A,temp(T,H[ans])) > dif(A,temp(T,H[i])))
                ans = i;
        }
        System.out.println(ans+1);
    }

    static double temp(double T, double h) {
        return T - h * 0.006;
    }

    static double dif(double T, double A) {
        return Math.abs(A - T);
    }
}