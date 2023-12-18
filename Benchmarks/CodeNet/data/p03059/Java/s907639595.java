import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int T = stdIn.nextInt();
        int sum = 0;
        for (int time = A; time < T + 0.5; time += A) {
            sum += B;
        }
        System.out.println(sum);
    }
}