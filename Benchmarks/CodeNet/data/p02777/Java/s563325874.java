import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int countS = sc.nextInt();
        int countT = sc.nextInt();
        String take = sc.next();

        if (take.equals(S)) {
            countS--;
            System.out.printf("%d %d", countS, countT);
        } else if (take.equals(T)) {
            countT--;
            System.out.printf("%d %d", countS, countT);
        } else {
            // 何もしない
        }
    }
}