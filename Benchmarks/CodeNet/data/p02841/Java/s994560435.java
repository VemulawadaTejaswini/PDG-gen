import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1 = in.nextInt();
        int d1 = in.nextInt();
        int m2 = in.nextInt();
        int d2 = in.nextInt();
        System.out.println(m1==m2?0:1);
    }
}
