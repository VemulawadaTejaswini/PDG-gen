import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] v = new double[N];
        for(int n=0; n<N; n++) v[n]=sc.nextDouble();
        Arrays.sort(v);

        double ans = v[0];
        for(int n=1; n<N; n++){
            ans = (ans+v[n])/2;
        }
        System.out.println(ans);
    }
}