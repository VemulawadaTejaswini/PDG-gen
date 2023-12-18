import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int orgSize = S.length();
        int prevSize = S.length();
        while(true) {
            S = S.replaceAll("01|10", "");
            if(prevSize == S.length()) break;
            prevSize = S.length();
        }
        System.out.println(orgSize - S.length());
    }
}