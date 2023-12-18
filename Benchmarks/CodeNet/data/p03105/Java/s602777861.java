import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a * c <= b) {
            System.out.println(c);
            return;
        } else {
            System.out.println(b / a);
        }

    }
}