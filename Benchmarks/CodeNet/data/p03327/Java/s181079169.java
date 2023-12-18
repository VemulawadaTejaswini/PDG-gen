import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n > 999) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}