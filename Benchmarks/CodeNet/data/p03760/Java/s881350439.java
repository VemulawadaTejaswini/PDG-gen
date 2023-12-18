import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] o = sc.nextLine().toCharArray();
        char[] e = sc.nextLine().toCharArray();
        for (int i = 0; i < e.length; i++) {
            System.out.print(o[i]);
            System.out.print(e[i]);
        }
        if (e.length != o.length) {
            System.out.print(o[o.length - 1]);
        }
        System.out.println();
    }
}