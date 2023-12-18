import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] m = new int[N];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            m[i] = scan.nextInt();
            sum += m[i];
            min = Math.min(m[i], min);
        }
        int answer = N;
        answer += (X - sum) / min;
        System.out.println(answer);
    }
}
