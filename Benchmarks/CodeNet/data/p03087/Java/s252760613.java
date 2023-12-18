import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        String[] s = sc.next().split("");
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < q; i++) {
            int length = 0;
            for (int j = l[i] - 1; j < r[i] - 1; j++) {
                if ("A".equals(s[j]) && "C".equals(s[j+1])) {
                    length++;
                }
            }
            System.out.println(length);
        }
    }
}