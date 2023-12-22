import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int buf;
        if (a[0] > a[1]) {
            buf = a[1];
            a[1] = a[0];
            a[0] = buf;
        }
        if (a[1] > a[2]) {
            buf = a[2];
            a[2] = a[1];
            a[1] = buf;
        }
        if (a[0] > a[1]) {
            buf = a[1];
            a[1] = a[0];
            a[0] = buf;
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}