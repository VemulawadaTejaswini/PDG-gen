import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    static int[]
        s1 = {1, 3, 5, 7, 8, 10, 12},
        s2 = {4, 6, 9, 11},
        s3 = {2};
    void solve() {
        Set<Integer> set1, set2, set3;
        set1 = new HashSet<>(); set2 = new HashSet<>(); set3 = new HashSet<>();
        for (int a : s1) set1.add(a); for (int a : s2) set2.add(a); for (int a : s3) set3.add(a);

        int x = sc.nextInt();
        int y = sc.nextInt();
        if (set1.contains(x) && set1.contains(y)) System.out.println("Yes");
        else if (set2.contains(x) && set2.contains(y)) System.out.println("Yes");
        else if (set3.contains(x) && set3.contains(y)) System.out.println("Yes");
        else System.out.println("No");
    }
}