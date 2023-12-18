import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = A; i <= B; i++)
        {
            if (i % k == 0)
            {
                System.out.print("OK");
                return;
            }
        }
        System.out.print("NG");
    }
}
