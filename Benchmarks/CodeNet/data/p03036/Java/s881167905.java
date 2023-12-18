import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = nextInt(sc);
        int D = nextInt(sc);
        int x2000 = nextInt(sc);

        calc(r, D, x2000, 10);
    }

    private static void calc(int r, int D, int xi, int count) {
        if (count == 0) return;

        int xi1 = r * xi - D;
        show(xi1);
        calc(r, D, xi1, --count);
    }

    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    private static void show(Object answer) {
        System.out.println(answer);
    }
}