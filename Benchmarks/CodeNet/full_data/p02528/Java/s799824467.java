import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    private static String join(ArrayList<Integer> ls) {
        StringBuilder sb = new StringBuilder();
        for (Integer n: ls) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<Integer>();

        int noItem = scan.nextInt();
        for (int i = 0; i < noItem; i++) {
            ls.add(scan.nextInt());
        }
        Collections.sort(ls);

        System.out.println(join(ls));
    }
}