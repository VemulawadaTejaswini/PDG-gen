import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String T = sc.next();

        for (int i = 0; i < N; i++) {
            System.out.print(S.toCharArray()[i]);
            System.out.print(T.toCharArray()[i]);
        }
        System.out.println();
    }
}
