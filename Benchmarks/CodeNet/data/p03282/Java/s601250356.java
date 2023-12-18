import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        String ans = "1";
        for (int i = 0; i <= 100 ; i++) {
            String ss = s.substring(i, i + 1);
            if(!ss.equals("1")) {
                ans = ss;
                break;
            }
        }
        System.out.println(ans);
    }
}