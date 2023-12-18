import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int q;
    private static String[] s;
    private static List<String> t = new ArrayList<>();
    private static List<String> d = new ArrayList<>();

    private static int calcBorder(boolean asc) {
        for (int i = 0; i < n - 1; i++) {
            int golemPos;
            if (!asc) {
                golemPos = i;
            } else {
                golemPos = n - i - 1;
            }
            boolean falled = false;
            for (int j = 0; j < q; j++) {
                String tj = t.get(j);
                String dj = d.get(j);
                if (!tj.equals(s[golemPos])) {
                    continue;
                }
                if ("L".equals(dj)) {
                    golemPos--;
                } else {
                    golemPos++;
                }
                if (asc && golemPos < 0 || !asc && golemPos > n - 1) {
                    falled = true;
                    break;
                }
            }
            if (!falled) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        s = sc.next().split("");
        for (int i = 0; i < q; i++) {
            t.add(sc.next());
            d.add(sc.next());
        }

        int startBorder = calcBorder(true);
        int endBorder = n - 1 - calcBorder(false);
        System.out.println("startBorder=" + startBorder);
        System.out.println("endBorder=" + endBorder);
        System.out.println("falled(0)=" + startBorder);
        System.out.println("falled(n)=" + (n - endBorder - 1));
        System.out.println(endBorder - startBorder + 1);

    }

}
