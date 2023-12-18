import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();
        int n = Integer.parseInt(sc.next());
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp.append(sc.next());
        }
        int p = Integer.parseInt(tmp.toString());
        tmp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp.append(sc.next());
        }
        int q = Integer.parseInt(tmp.toString());

        tmp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp.append(i+1);
        }
        permutation(tmp.toString(), "");
        System.out.println(Math.abs((list.indexOf(p)+1) - (list.indexOf(q)+1)));
    }

    private static void permutation(String str, String ans) {
        if (str.isEmpty()) {
            list.add(Integer.parseInt(ans));
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            permutation(str.substring(0, i) + str.substring(i + 1), ans + c);
        }
    }
}
