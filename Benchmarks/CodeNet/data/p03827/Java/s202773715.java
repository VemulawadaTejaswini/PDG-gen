import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        char[] string = sc.next().toCharArray();
        int x = 0;
        int maxX = x;
        for (char c : string) {
            switch (c) {
            case 'I':
                x++;
                break;
            case 'D':
                x--;
                break;
            }

            maxX = Math.max(maxX, x);
        }

        System.out.println(maxX);
    }
}