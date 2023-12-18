import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        int N = sc.nextInt();
        int X = sc.nextInt() - 1;
        int Y = sc.nextInt() - 1;
        int[] ans = new int[N];
        for (int i = 0 ; i < N; i++) for (int j = i + 1; j < N; j++) {
            ++ans[Integer.min(j-i, Integer.min(Math.abs(i-X) + Math.abs(j-Y), Math.abs(i-Y) + Math.abs(j-X)) + 1)];
        }
        for (int i = 1; i < N; i++) {
            System.out.println(ans[i]);
        }
    }
}
