import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int x = Integer.parseInt(str);

        System.out.println(x*x*x);
    }
}