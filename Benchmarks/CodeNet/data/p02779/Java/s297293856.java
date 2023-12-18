import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean ans = true;

        for (int i = 0; i < n; i++) {
            if(!set.add(sc.nextInt())){
                ans = false;
            }
        }

        System.out.println(ans ? "YES" : "NO");
    }
}