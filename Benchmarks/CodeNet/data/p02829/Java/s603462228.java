import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (a+b) {
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(2);
                break;
            case 5:
                System.out.println(1);
                break;
        }
    }
}
