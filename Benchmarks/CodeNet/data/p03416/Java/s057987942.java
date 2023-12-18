import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            char[] tmp = String.valueOf(i).toCharArray();
            if (tmp[0] == tmp[4] && tmp[1] == tmp[3]) {
                count++;
            }
        }
        System.out.println(count);
    }
}