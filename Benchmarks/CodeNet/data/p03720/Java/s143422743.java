import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[n];
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt() - 1;
            int a2 = sc.nextInt() - 1;
            count[a1]++;
            count[a2]++;
        }
        
        for (int a : count) {
            System.out.println(a);
        }
    }
}