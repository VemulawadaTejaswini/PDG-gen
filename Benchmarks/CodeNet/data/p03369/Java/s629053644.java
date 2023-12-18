import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.next();
        int res = 700;
        for (int i = 0; i < 3; ++i) {
            char a = s.charAt(i);
            if (a == 'o') {
                res += 100;
            }
        }

        System.out.println(res);
    }

}