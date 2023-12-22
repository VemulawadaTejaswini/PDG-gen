import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String str;
        while (true) {
            str = sc.nextLine();
            if (isFin(str))
                break;
            System.out.println(digitSum(str));
        }

    }

    int digitSum(String str) {
        int sum = 0;
        String[] strArr = str.split("");
        for (int i = 0; i < str.length(); ++i) {
            sum += Integer.parseInt(strArr[i]);
        }
        return sum;
    }

    boolean isFin(String str) {
        return str.equals("0");
    }
}




