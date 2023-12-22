import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int a = N % 10;

        switch (a) {
            case 3:
                System.out.println("bon");
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            default:
                System.out.println("hon");
        }
        return;

    }
}
