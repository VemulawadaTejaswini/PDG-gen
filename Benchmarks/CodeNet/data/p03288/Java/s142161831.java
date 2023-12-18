import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        final int iNum = sc.nextInt();
        String sResult;
        if (iNum < 1200) {
            sResult = "ABC";
        } else if (iNum < 2800) {
            sResult = "ARC";
        } else {
            sResult = "AGC";
        }
        System.out.print(sResult);
    }
}
