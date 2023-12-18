import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double M = sc.nextDouble();
        double[] a = new double[(int)n];
        double cnt = 0;
        double sum = 0;
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.err.println(sum);
        for(int i = 0; i<n; i++) {
            System.err.println(a[i]/sum);
            if(a[i]/sum >= 1/(4*M)) cnt++;
        }
        if(cnt>= M) System.out.println("Yes");
        else System.out.println("No");
    }
}