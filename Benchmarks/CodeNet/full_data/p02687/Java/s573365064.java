import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String ans = "ABC";
        String str = s.next();
        if ("ABC".equals(str)) {
            ans = "ARC";
        }
        System.out.println(ans);
    }
}
