import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        String ans = "";
        while (true) {
            double x = Math.pow(26, i);
            int c = n % 26;
            ans = String.valueOf((char)(0x60 + c)) + ans;
            if (n < x) {
                break;
            }
            n /= x;
        }
        System.out.println(ans);
    }
}
