import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        String ans = "";
        for (char c = 'a' ; c <= 'z' ; c++) {
            int x = 50;
            for (int i = 0 ; i < n ; i++) {
                int count = 0;
                for (int j = 0 ; j < s[i].length() ; j++) {
                    if (c == s[i].charAt(j)) {
                        count++;
                    }
                }
                x = Math.min(x,  count);
            }
            for (int i = 0 ; i < x ; i++) {
                ans += String.valueOf(c);
            }
        }
        System.out.println(ans);

    }

}
