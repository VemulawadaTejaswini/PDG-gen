import java.util.Scanner;

public class Main {
    public void call(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else if (i % 10 == 3) {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();
        int inputNum;

        inputNum = Integer.parseInt(scan.next());
        app.call(inputNum);
    }
}

