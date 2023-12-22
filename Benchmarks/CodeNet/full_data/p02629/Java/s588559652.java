import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long q = N;
        long r = 0;
        String res = "";
        while (q != 0) {
            r = q % 26;
            q /= 26;
            if (r == 0) {
                res += String.valueOf('z');
            } else {
                res += String.valueOf((char)('a' + (r - 1)));
            }
        }

        String res1 = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            res1 += String.valueOf(res.charAt(i));
        }
        System.out.println(res1);   
        sc.close();
    }
}