import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean isVaild = true;
        String output = "";

        for (int i = 0; i < t.length(); i++) {
            if (i != t.length()-1) {
                if (s.charAt(i) != t.charAt(i)) {
                    isVaild = false;
                    break;
                }
            }
        }
        if (isVaild) {
            output = "yes";
        }else {
            output = "no";

        }
        // 出力
        System.out.println(output);
    }
}