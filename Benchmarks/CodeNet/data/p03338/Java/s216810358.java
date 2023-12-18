import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            String x = s.substring(0, i);
            String y = s.substring(i);
            set.clear();
            for (int j = 0; j < x.length(); j++) {
                String tmp = x.substring(j, j + 1);
                if(y.contains(tmp)) {
                    set.add(tmp);
                }
            }
            list.add(set.size());
        }
        System.out.println(Collections.max(list));
    }
}