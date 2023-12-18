import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            String A = sc.next();
            if (!set.contains(A)) {
                set.add(A);
            } else {
                set.remove(A);
            }
        }
        System.out.println(set.size());
        sc.close();

    }
}