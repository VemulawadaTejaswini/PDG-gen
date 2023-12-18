import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] p = new double[N];

        for (int i = 0; i < p.length; i++) {
            p[i] = CalcEx(sc.nextDouble());
        }

        int size=N-K+1;
        double[] ans=new double[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < K; j++) {
                ans[i]+=p[j+i];
            }
        }

        Arrays.sort(ans);

        System.out.println(ans[ans.length-1]);
    }
    public static double CalcEx(double p) {
        double result=0;
        result=(p+1)/2;
        return result;
    }
}