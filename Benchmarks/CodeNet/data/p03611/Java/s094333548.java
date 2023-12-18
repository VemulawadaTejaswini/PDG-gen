import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i ++) {
            int m = sc.nextInt();
            a.add(m - 1);
            a.add(m);
            a.add(m + 1);
        }
        Collections.sort(a);
        int r = 0;
        int mode = 0;
        for (int i = 0 ; i < a.size() ; i++) {
            while ( r < a.size()) {
                if (a.get(i) == a.get(r)) {
                    r++;
                } else {
                    mode = Math.max(mode, r - i);
                    break;
                }
            }
        }
        System.out.println(mode);
    }

}