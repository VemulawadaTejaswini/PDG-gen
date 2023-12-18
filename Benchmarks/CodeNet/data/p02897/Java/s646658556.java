import java.util.Scanner;
public class od{
    public static void main(String[] args){
        int N = 101;
        int sum = 0;
        double p;
        Scanner scanner = new Scanner();
        while (N >= 100) {
            N = scanner.next();
        }
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                sum += 1;
            }
        }
        p = sum / N;
        System.out.print(p);
    }
}