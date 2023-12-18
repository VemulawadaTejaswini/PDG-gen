import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(abc058_b(sc.next(),sc.next()));
    }

    static String abc058_b(String O, String E) {
        String[] o = new String[O.length()];
        for (int i = 0; i < o.length; i++) {
            o[i] = String.valueOf(O.charAt(i));
        }
        String[] e = new String[E.length()];
        for (int i = 0; i < e.length; i++) {
            e[i] = String.valueOf(E.charAt(i));
        }
        String pass = "";
        for (int i = 0; i < e.length; i++) {
            pass = pass + o[i] + e[i];
        }
        if (o.length == e.length) {
            return pass;
        }
        return pass + o[o.length - 1];
    }

}
