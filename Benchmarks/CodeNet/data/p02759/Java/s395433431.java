import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int Q=N/2;
        int r=N%2;

        System.out.println(Q+r);
        sc.close();
    }
}