import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;
        for(int i = 1; i <= n; i++) {
            if((i + k - 1) <= n ) {
                result++;
            }
        }
        System.out.print(result);
        sc.close();
    }
}