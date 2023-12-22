import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> S = new HashSet<Integer>();
        for (int i = 0; i < n; i++) S.add(sc.nextInt());

        int q = sc.nextInt();
        Set<Integer> T = new HashSet<Integer>();
        for (int i = 0; i < q; i++) T.add(sc.nextInt());

        T.retainAll(S);
        System.out.println(T.size());
    }
}