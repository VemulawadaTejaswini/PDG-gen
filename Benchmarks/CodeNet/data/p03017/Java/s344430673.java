import java.util.Scanner;

public class Main {

    private static char[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;

        int goalA = sc.nextInt() - 1;
        int goalB = sc.nextInt() - 1;

        s = sc.next().toCharArray();

        boolean isB = jump(b, goalB);
        boolean isA = jump(a, goalA);

        System.out.println((isA && isB) ? "YES" : "NO");
    }

    private static boolean jump(int i, int goal) {
        if (i > s.length || s[i] == '#') return false;

        if (i == goal) {
            s[i] = '#';
            return true;
        }

        return jump(i + 1, goal) || jump(i + 2, goal);
    }
}