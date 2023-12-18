import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] S = sc.next().toCharArray();
        int blackCount = 0;
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == 'B') {
                blackCount++;
            } else {
                count += blackCount;
            }
        }
        System.out.println(count);
    }
}