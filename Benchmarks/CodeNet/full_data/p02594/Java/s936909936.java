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
        if (degree >= 30) {
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }
}

