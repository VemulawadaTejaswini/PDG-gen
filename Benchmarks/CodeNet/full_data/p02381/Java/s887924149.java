import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                double sum = 0, sd = 0;
                double[] s = new double[n];

                for(int i = 0; i < n; i++) {
                    s[i] = scn.nextDouble();
                    sum += s[i];
                }
                double avg = sum / n;
                for(int i = 0; i < n; i++) {
                    sd += Math.pow((s[i] - avg), 2);
                }
                System.out.println(Math.sqrt(sd / n));
            }
        }
    }
}