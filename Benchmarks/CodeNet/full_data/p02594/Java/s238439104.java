import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int degree = in.nextInt();
        String ans = Ac(degree);
        System.out.println(ans);
    }

    public static String Ac(int degree) {
        String result;
        if (degree >= 40) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
}

