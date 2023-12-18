import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> s = new HashSet<>(n);
        boolean dup = false;
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(s.contains(a)) {
                dup = true;
            }
            else {
                s.add(a);
            }
        }
        System.out.println(dup ? "NO" : "YES");
    }
}
