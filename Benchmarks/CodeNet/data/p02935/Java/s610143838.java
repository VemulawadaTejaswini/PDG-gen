import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] v = new Double[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextDouble();
        }
        Arrays.sort(v);
        double ans = v[0];
        for(int i = 1; i < n; i++){
            ans = (ans+v[i])/2;
        }
        System.out.println(ans);
    }
}
