import java.util.Scanner;

public class Main {
    static int a;
    static int b;
    static int c;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        if(b - a == c - b){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}