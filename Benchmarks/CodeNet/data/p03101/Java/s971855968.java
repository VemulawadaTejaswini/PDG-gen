import java.util.Scanner;

class Problem {
    private int H;
    private int W;
    private int h;
    private int w;

    Problem() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        h = sc.nextInt();
        w = sc.nextInt();
    }

    int solve() {
        return H * W - (h * W + w * H - h * w);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
