import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int height = 0;
        for (int i = 0; i < b - a; i++) {
            height += i;
        }
        System.out.println(height - a);
    }
}
