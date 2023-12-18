import java.util.Scanner;

public class ABC160A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String subString = S.substring(2, 6);
        if (subString.equals("ffee")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}