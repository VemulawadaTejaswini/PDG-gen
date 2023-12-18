import java.util.Scanner;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int x = Math.min(n, m);
        int y = Math.max(n, m);

        k = Math.min(k, x * y - k);

        boolean found = false;
        for (int i = 0; i < (x + 1) / 2 && !found; i++) {
            int count = i * y;
            if(count == k) {
                found = true;
                break;
            }
            for (int j = 0; j < y; j++) {
                count += x - i;
                if(count == k) {
                    found = true;
                    break;
                }
            }
        }

        for (int i = (x + 1) / 2 ; i < x && !found; i++) {
            int count = i * y;
            if(count == k) {
                found = true;
                break;
            }
            for (int j = 0; j < y; j++) {
                count -= x - i;
                if(count == k) {
                    found = true;
                    break;
                }
            }
        }

        if(found) System.out.println("Yes");
        else System.out.println("No");
    }
}