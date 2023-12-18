import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long x = sc.nextLong();

        long money = 100;
        int count = 0;
        while(true) {
            count++;
            money = (long) Math.floor(money * 1.01);
            if (money >= x) {
                System.out.println(count);
                return;
            }
        }
    }
}
