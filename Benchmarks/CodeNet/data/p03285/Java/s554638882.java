import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i <= 100; i+=4) {
            for (int j = 0; j <= 100-i; j+=7) {
                if (i+j == n)
                    flag = true;
                if (i+j > n)
                    break;
            }
        }
        
        System.out.println(flag ? "Yes" : "No");
    }
}
