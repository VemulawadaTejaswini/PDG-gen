import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        in.useDelimiter("\\D");
        int w = in.nextInt();
        int n = in.nextInt();
        int[] amida = new int[w + 1];
        for (int i = 1; i < amida.length; i++) {
            amida[i] = i;
        }
        while (n --> 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int tmp = amida[a];
            amida[a] = amida[b];
            amida[b] = tmp;
        }
        for (int i = 1; i < amida.length; i++) {
            System.out.println(amida[i]);
        }
    }
}