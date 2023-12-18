import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        int work = (int) Math.pow(100, d);

        System.out.println(work * n);

    }
}