import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        if (n == 100)
            n = 101;
        
        if (d == 0)
            System.out.print(n);
        else if (d == 1)
            System.out.print(n * 100);
        else if (d == 2)
            System.out.print(n * 10000);
    }
}
