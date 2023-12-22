import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        while ((x = sc.nextInt()) != 0 || (y = sc.nextInt()) != 0) {
            if (x > y) {
                System.out.println(y + " " + x);
            } else {
                System.out.println(x + " " + y);
            }
        }
    }
}
