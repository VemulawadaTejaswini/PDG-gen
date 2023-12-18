import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println(Math.max(a1, Math.max(a2, a3))-Math.min(a1, Math.min(a2, a3)));
    }
}