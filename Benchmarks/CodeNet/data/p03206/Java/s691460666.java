import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        switch (d) {
            case 25: System.out.println("Christmas"); break;
            case 24: System.out.println("Christmas Eve");  break;
            case 23: System.out.println("Christmas Eve Eve"); break;
            case 22: System.out.println("Christmas Eve Eve Eve"); break;
            default:
        }
    }
}
