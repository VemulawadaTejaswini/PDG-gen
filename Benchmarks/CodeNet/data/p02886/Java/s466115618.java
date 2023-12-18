import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int answer = 0;
        for (int j = 0; j < n; j++) {
            int d = in.nextInt();
            sum += d;
            answer -= d * d;
        }
        answer += sum * sum;
        answer /= 2;
        System.out.println(answer);
    }
}
