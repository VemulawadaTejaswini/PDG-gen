import java.util.Scanner;

class Problem {
    private String S;
    Problem() {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
    }

    String solve() {
        if (S.compareTo("2019/04/30") <= 0) {
            return "Heisei";
        } else {
            return "TBD";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
