import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ary = {"", "SUN","MON","TUE","WED","THU","FRI","SAT"};
        for (int i = 0; i < ary.length; i++) {
            if (s.equals(ary[i])) {
                System.out.println(Math.abs(7 - i) + 1);
                return;
            }
        }
    }
}