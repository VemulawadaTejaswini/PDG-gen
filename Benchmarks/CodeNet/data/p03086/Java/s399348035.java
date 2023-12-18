import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArrays = a.toCharArray();

        int max = 0;
        for (int i=0; i<charArrays.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=i; j<charArrays.length; j++) {
                if (!isACGT(charArrays[j])) {
                    break;
                }
                sb.append(charArrays[j]);
                String ret = sb.toString();
                if (max < ret.length()) {
                    max = ret.length();
                }
            }
        }

        System.out.println(max);
    }

    public static boolean isACGT(char c) {
        String s = String.valueOf(c);
        switch (s) {
            case "A":
                return true;
            case "C":
                return true;
            case "G":
                return true;
            case "T":
                return true;
            default:
                return false;
        }
    }
}
