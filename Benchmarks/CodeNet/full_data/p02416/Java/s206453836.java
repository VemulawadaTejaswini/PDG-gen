import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String a;
            a = scan.next();
            if(a.equals("0"))break;
            int ans = 0;
            int i=0;
            while (i < a.length()) {
                char x =a.charAt(i);
                i++;
                int y = Character.getNumericValue(x);
                ans = ans+y;
            }
            System.out.println(ans);
            ans = 0;
        }
        scan.close();
        return;
    }
}
