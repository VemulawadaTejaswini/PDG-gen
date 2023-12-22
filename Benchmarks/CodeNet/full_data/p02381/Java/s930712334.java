import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = 0;
            double m = 0,s,s2=0;
            n = sc.nextInt();
            if (n == 0)
                break;
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = sc.nextInt();
                m += d[i];
            }
            m /= n;
            for (int j = 0; j < n; j++)
                s2 += Math.pow(d[j]-m,2);
            s2 /= n;
            s = Math.sqrt(s2);

            System.out.println(s);
        }
    }
}
