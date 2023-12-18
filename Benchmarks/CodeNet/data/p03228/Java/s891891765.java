import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        while (count < k) {
            count++;
            if (a % 2 == 1) a--;
            b += a / 2;
            a = a / 2;
            
            if (count >= k) break;
            
            count++;
            if (b % 2 == 1) b--;
            a += b / 2;
            b = b / 2;
        }
        System.out.println(a + " " + b);
    }
}
