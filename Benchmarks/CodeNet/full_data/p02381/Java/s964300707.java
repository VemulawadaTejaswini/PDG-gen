package lecture4me.Deviation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                double average = 0, variance = 0;
                double Ldif = 0, dif = 0,total=0;
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                    dif = scores[i] - average;
                    Ldif = Ldif + dif;
                    total+=scores[i];
                }
                average = total / scores.length;
                variance = (Ldif) * (Ldif) / scores.length;
                System.out.println(Math.sqrt(variance));
            }
        }
    }
}

