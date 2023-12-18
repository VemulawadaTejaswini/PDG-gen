import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
            String target = s.substring(l[i] - 1, r[i]);
            int length = (target.length() - target.replace("AC", "").length()) / 2;
            sb.append(length);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}