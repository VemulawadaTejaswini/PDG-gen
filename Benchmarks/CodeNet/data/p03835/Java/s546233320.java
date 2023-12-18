import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        if (3*k < s) {
            System.out.println(0);
        } else if (3*k == s) {
            System.out.println(1);
        } else {
            int count = 0;
           for (int x = 0; x <= k; x++) {
               for (int y = 0; y <= k; y++) {
                   for (int z = 0; z <= k; z++) {
                       if (x + y + z == s) count++;
                   }
               }
           }
           System.out.println(count);
        }
    }
}