import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        int i = scan.nextInt();
        Task tsk = new Task();
        System.out.println(tsk.solve(N, i));
    }

    static class Task{
        public int solve(int n, int i) {
            return n + 1 - i;
        }
    }
}
