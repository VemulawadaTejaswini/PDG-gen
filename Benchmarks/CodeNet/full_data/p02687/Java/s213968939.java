import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String B = "ABC";
        String R = "ARC";
        if (S.equals(B)) {
            System.out.println(R);
        } else {
            System.out.println(B);
        }
    }
}