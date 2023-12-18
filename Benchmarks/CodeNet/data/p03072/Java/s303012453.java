import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] hotels = new int[n];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            hotels[i] = Integer.parseInt(sc.next());
        }
        for (int i = n - 1; i > 0; i--) {
            if (hotels[i] >= hotels[0] && hotels[i] >= hotels[i - 1]) {
                cnt++;
            } 
        }
        System.out.println(cnt);
    }
}
