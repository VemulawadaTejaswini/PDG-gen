import java.util.Scanner;

class Problem {
    private String b;

    Problem() {
        Scanner sc = new Scanner(System.in);
        b = sc.next();
    }

    String solve() {
        if (b.equals("A")) {
            return "T";
        } else if (b.equals("C")) {
            return "G";
        } else if (b.equals("G")) {
            return "C";
        } else {
            return "A";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
