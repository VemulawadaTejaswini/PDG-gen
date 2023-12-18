import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c = sc.nextInt();
        System.out.print("d:");
        int d = sc.nextInt();

        if (Math.abs(b - a) + Math.abs(c - b) <= d || Math.abs(c - a) <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
