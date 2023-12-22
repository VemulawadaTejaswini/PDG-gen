import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                sc.close();
                return;
            }
            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }
            double sum = 0;
            for(int i=0;i<n;i++){
                sum += s[i];
            }
            double ave = (double)sum / n;
            double arufa = 0;
            for(int i=0;i<n;i++){
                arufa += (s[i] - ave) * (s[i] - ave);
            }
            System.out.println(Math.sqrt(arufa / n));
        }
    }
}
