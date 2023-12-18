import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void execute () {
        Scanner sc = new Scanner(System.in);
        String nk = sc.nextLine();
        String s = sc.nextLine();
        String[] nkParam = nk.split(" ");
        int length = Integer.parseInt(nkParam[0]);
        int execNum = Integer.parseInt(nkParam[1]);

        ArrayList<String> l = new ArrayList<>();
        {
            String t = new StringBuilder(s).reverse().toString();
            String u = s + t;
            for (int k = 0; k < u.length() - (length - 1); k++) {
                String ss = u.substring(k, k + length);
                l.add(ss);
            }
        }

        ArrayList<String> nl = new ArrayList<>();
        if (execNum > 1) {
            for (int i = 0; i < (execNum - 1); i++) {
                for (String sss : l) {
                    String t = new StringBuilder(sss).reverse().toString();
                    String u = sss + t;
                    for (int j = 0; j < u.length() - (length - 1); j++) {
                        String ss = u.substring(j, j + length);
                        nl.add(ss);
                    }
                }
            }
        } else {
            nl.addAll(l);
        }

        String ns = "";
        for (String ss : nl) {
            if (ns.isEmpty()) {
                ns = ss;
                continue;
            }
            if (ss.compareTo(ns) < 0) {
                ns = ss;
            }
        }
        System.out.println(ns);
    }

    public static void main(String[] args) {
        new Main().execute();
    }

}