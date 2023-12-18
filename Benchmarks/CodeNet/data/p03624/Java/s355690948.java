import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        String s = sc.nextLine();
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) == -1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("None");
    }
}