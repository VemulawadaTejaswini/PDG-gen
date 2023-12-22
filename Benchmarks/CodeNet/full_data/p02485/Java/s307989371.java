import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str;
        int ans;
        for (;;) {
            str = sc.next();
            ans = 0;
            if (str.equals("0")) break;
            for (char c : str.toCharArray()) {
                ans += c - '0';
            }
            System.out.println(ans);
        }
    }
}