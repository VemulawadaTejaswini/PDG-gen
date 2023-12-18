import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String sNum = sc.nextLine();
        String sConv1 = sNum.substring(0, 1);
        String sConv2 = sNum.substring(2, 3);
        String sResult = "";

        if (0 == Integer.parseInt(sConv1) || 0 == Integer.parseInt(sConv2)) {
            sResult = "NA";
        } else if (12 >= Integer.parseInt(sConv1) && 12 >= Integer.parseInt(sConv2)) {
            sResult = "AMBIGUOUS";
        } else if (12 < Integer.parseInt(sConv1)) {
            sResult = "YYMM";
        } else if (12 < Integer.parseInt(sConv2)) {
            sResult = "MMYY";
        }
        System.out.print(sResult);
    }
}
