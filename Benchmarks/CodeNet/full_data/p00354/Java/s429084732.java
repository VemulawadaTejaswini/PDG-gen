
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        switch (x%7) {
            case 0:
                System.out.println("thu");
                break;
            case 1:
                System.out.println("fri");
                break;
                case 2:
                System.out.println("sat");
                break;
                case 3:
                System.out.println("sun");
                break;
                case 4:
                System.out.println("mon");
                break;
                case 5:
                System.out.println("tue");
                break;
                case 6:
                System.out.println("wed");
                break;
        }
    }
}

