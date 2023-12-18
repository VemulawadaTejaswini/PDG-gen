
import java.util.*;

public class Main {
    public static long sa = 0;
    public static long sb = 0;
    public static long su = 0;
    public static long sv = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        sc.useDelimiter("");
        char[] s = new char[N];
        String S = sc.next();
        s = S.toCharArray();

//        Set<String> set = new HashSet<String>();
        int size = 0;
        String old = "";

        String a = "";
        for (int i = 0; i < N-3; i++) {
            String tmp = a;
            a = a + s[i];
            for (int j = i; j < N-3; j++) {
                if (j == i) {
                    continue;
                }
                String tmp2 = a;
                a = a + s[j];
                for (int k = j; k < N-3; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    String tmp3 = a;
                    a = a + s[k];
//                    System.out.println(a);
                    if (!old.contains(a)) {
                        old += "+" + a;
//                        set.add(a);
                        size++;
                    }
                    a = tmp3;
                }
                a = tmp2;
            }
            a = tmp;
        }
        System.out.println(size);
    }
}