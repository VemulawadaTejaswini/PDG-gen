import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        solve();
    }
}
