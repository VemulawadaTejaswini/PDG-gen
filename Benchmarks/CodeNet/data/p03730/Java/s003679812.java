import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ABC = sc.nextLine().split(" ");

        int A = Integer.parseInt(ABC[0]);
        int B = Integer.parseInt(ABC[1]);
        int C = Integer.parseInt(ABC[2]);

        boolean isPossible = false;
        for (int i = 0; i < 100; i++) {
            if (i * A % B == C) {
                isPossible = true;
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}
