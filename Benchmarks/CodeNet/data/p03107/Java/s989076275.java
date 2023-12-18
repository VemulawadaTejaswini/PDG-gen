import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Main {
 
    public static void main(String[] args) {
        q_3();
    }
 
    private static void q_1() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
 
            System.out.println(b / a < c ? b / a : c);
        }
    }
 
    private static void q_2() {
        try(Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
 
            int min = Math.min(a, b);
 
            int cnt = 0;
            for (; min >= 1; min--) {
                if (a % min == 0 && b % min == 0) {
                    cnt ++;
                    if(cnt == c) {
                        break;
                    }
                }
            }
 
            System.out.println(min);
        }
    }
 
    private static void q_3() {
        try(Scanner scan = new Scanner(System.in)) {
 
            String target = scan.next();
 
            int cnt = 0;
            while(true) {
                    if(target.indexOf("01") == -1 && target.indexOf("10") == -1) {
                            break;
                    }
                    String tmp = target;
 
                    target = target.replace("01", "");
 
                    cnt += tmp.length() - target.length();
 
                    tmp = target;
 
                    target = target.replace("10", "");
 
                    cnt += tmp.length() - target.length();
            }
 
            System.out.println(cnt);
 
        }
    }
}