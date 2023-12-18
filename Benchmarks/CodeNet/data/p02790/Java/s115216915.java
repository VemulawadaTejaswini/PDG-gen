import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            sba.append(a);
        }
        for (int i = 0; i < a; i++) {
            sbb.append(b);
        }

        System.out.println(compareStr(sba.toString(), sbb.toString()));
        sc.close();
    }

    private static String compareStr(String a, String b) {
        int i = a.compareTo(b);
        if (i <= -1) {
            return a;
        }
        if (i >= 1) {
            return b;
        } else {
            return a;
        }
    }
}
