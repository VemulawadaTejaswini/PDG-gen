import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        String firstString = S.substring(0, 2);
        String lastString = S.substring(2, 4);

        String result = "NA";
        int count = 0;
        if (isYY(firstString)) {
            if (isMM(lastString)) {
                result = "YYMM";
                count++;
            }
        }
        if (isMM(firstString)) {
            if (isYY(lastString)) {
                result = "MMYY";
                count++;
            }
        }
        if (count == 2) {
            result = "AMBIGUOUS";
        }
        System.out.println(result);
    }
    public static boolean isYY(String string) {

        boolean flag = false;
        if (string.matches("[0-9]{2}")) {
            flag = true;
        }
        return flag;
    }
    public static boolean isMM(String string) {

        boolean flag = false;
        if (string.matches("0[1-9]{1}") || string.matches("1[0-2]{1}")) {
            flag = true;
        }
        return flag;
    }
}