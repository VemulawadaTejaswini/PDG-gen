import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = Long.parseLong(sc.next());
            StringBuilder ans = new StringBuilder();
            while(N > 0) {
                N--;
                ans.insert(0, (char) ('a' + (N % 26)));
                N /= 26;
            }
            System.out.println(ans);
        }
    }
}