import java.util.Scanner;

class Main {

    void go() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int size = a * b;
        int length = 2 * a + 2 * b;
        System.out.println(size + " " + length);
    }

    public static void main(String[] args) {
        Rectangle cui = new Rectangle();
        cui.go();
    }
}
