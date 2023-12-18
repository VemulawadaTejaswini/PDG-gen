import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        HashSet<String> S = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            S.add(scan.next());
        }
        System.out.println(S.size());
        scan.close();
    }
}