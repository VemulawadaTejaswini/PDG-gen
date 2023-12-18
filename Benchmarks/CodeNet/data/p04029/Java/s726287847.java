import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(n)
        int n = sc.nextInt();

        System.out.println((1+n)*n/2);
        sc.close();
    }
}
