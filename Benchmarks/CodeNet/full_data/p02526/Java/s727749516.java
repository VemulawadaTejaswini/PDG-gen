import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        HashSet<Integer> S = new HashSet<>();
        for (int i=0; i<n; i++) S.add(sc.nextInt());

        int q = sc.nextInt();
        int count=0;
        for (int i=0; i<q; i++) count += S.contains(sc.nextInt()) ? 1 : 0;

        System.out.println(count);
    }
}