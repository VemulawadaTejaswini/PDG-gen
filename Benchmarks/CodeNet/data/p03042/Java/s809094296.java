import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zen = Integer.valueOf(s.substring(0, 2));
        int kou = Integer.valueOf(s.substring(2, 4));
        String res = "AMBIGUOUS";
        boolean a = false;
        boolean b = false;
        if (12 < zen) {
            res = "YYMM";
            a = true;
        }
        if (12 < kou) {
            res = "MMYY";
            b = true;
        }
        if (a && b) {
            System.out.println("NA");
        } else {
            System.out.println(res);
        }
    }
}