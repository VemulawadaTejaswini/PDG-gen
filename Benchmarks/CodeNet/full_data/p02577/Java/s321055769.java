import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        long sum = 0;
        for(int i=0; i<len; i++) {
            sum += Long.parseLong(s.substring(i, i+1));
        }
        System.out.println(sum%9==0 ? "Yes" : "No");
    }
}
