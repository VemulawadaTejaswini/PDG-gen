import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = "E" + sc.next() + "E";

        long result = 0;
        String[] arrS = s.split("><");

        if (arrS.length > 1) {
            for (int i = 0; i < arrS.length; i++) {
                if (i == 0) {
                    arrS[i] += ">";
                } else if (i == arrS.length - 1) {
                    arrS[i] = "<" + arrS[i];
                } else {
                    arrS[i] = "<" + arrS[i] + ">";
                }
                result += getCount(arrS[i]);
            }

        } else {
            result += getCount(arrS[0]);
        }

        System.out.println(result);
    }

    public static long getCount(String s) {
        s = "E" + s + "E";
        String[] countS = s.split("<>");

        long result = 0;
        if (countS.length < 2) {
            s = s.replace("E", "");
            for (long i = 1; i <= s.length(); i++) {
                result += i;
            }

        } else {

            long left = countS[0].replace("E", "").length() + 1;
            long right = countS[1].replace("E", "").length() + 1;

            long max = Math.max(left, right);
            long min = Math.min(left, right);
            for (long i = 1; i <= max; i++) {
                result += i;
                if (i < min) {
                    result += i;
                }
            }
        }

        return result;
    }

}