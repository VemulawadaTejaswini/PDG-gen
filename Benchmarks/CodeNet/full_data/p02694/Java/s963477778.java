import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long money = 100;
        long rishi = 1;
        long year = 0;

        for(;;){
            year++;
            money = money + rishi;
            rishi = money / 100;
            if(X <= money) {
                System.out.println(year);
                return;
            }
        }

    }
}