import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();

        int pieces = A * 3 + P;

        System.out.println(pieces / 2);

    }
}
