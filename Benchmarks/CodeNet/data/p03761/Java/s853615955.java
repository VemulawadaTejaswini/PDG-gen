import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> l = new ArrayList<List<String>>();
        for (int i = 0 ; i < n ; i++) {
            String s = sc.next();
            List<String> m = new ArrayList<String>();
            for (int j = 0 ; j < s.length() ; j++) {
                m.add(s.substring(j, j + 1));
            }
            l.add(m);
        }
        List<String> a = l.get(0);
        for (int i = 1 ; i < n ; i++) {
            a.retainAll(l.get(i));
        }
        Collections.sort(a);
        for (int i = 0 ; i < a.size() ; i++) {
            System.out.print(a.get(i));
        }
        System.out.println("");

    }

}