import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int s = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(s <= w ? "unsafe" : "safe");
    }
}
