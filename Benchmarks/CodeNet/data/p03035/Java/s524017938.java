
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = nextInt(sc);
        int B = nextInt(sc);

        show(calc(A, B));
    }

    private static int calc(int A, int B) {
        return (A >= 13) ? B : (12 >= A && A >= 6) ? B/2 : 0;
    }

    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    private static void show(Object answer) {
        System.out.println(answer);
    }
}