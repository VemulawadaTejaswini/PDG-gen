import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int [] s = new int[n];
            double sum = 0;
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
                sum += s[i]; 
            }
            double m = (double) sum / n;
            sum = 0;
            for(int i = 0; i < n; i++){
                sum += (s[i] - m) * (s[i] - m);
            }
            double a = (double)sum / n;
            a = Math.pow(a, 0.5);
            System.out.printf("%.8f\n", a);
        }
        sc.close();
    }
}
