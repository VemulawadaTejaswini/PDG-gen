import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
// ????????????????????????
        System.out.printf("a %s b\n", comparisonSign(a,b));
    }
    private static String comparisonSign(int a, int b) {
        if (a == b) {
          return "==";
        } else if(a > b) {
          return ">";
        } else {
          return "<";
        }
    }
}