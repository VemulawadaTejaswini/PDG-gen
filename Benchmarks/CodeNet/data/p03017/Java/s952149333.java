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

        System.out.println(jump(a, b, goalA, goalB) ? "YES" : "NO");
    }

    private static boolean jump(int a, int b, int goalA, int goalB) {
        if (a >= s.length || s[a] == '#') return false;
        if (b >= s.length || s[b] == '#') return false;
        if (a == b) return false;

        if (a == goalA && b == goalB) return true;

        return jump(a + 1, b, goalA, goalB) || jump(a, b + 1, goalA, goalB) || jump(a + 2, b, goalA, goalB) || jump(a, b + 2, goalA, goalB);
    }
}