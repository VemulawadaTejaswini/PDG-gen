import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        if (N % 2 > 0) {
            System.out.println("No");
        } else if (S.substring(0, N/2).equals(S.substring(N/2, N))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}