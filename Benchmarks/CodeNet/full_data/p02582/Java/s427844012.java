import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int c = 0;

        if (S.equals("RRR")) {
            c = 3;
        } else if (S.equals("RRS") || S.equals("SRR")) {
            c = 3;
        } else if (S.equals("SSS")) {
            c = 0;
        } else {c = 1;}

        System.out.println(c);
    }
}