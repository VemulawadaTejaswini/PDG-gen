import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        if (n <= k)
            System.out.println("NO");
        else {
            int count = 1;
            int num = 1;
            while(count<k && num<=n) {
                num += 2;
                count++;
            }
            if (count == k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
