import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a * 10 + b) %4 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}