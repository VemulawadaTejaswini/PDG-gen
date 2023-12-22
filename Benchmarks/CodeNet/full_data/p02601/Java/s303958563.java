import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), 
        b = sc.nextInt(), 
        c = sc.nextInt(), 
        k = sc.nextInt();
        sc.close();

        while (k > 0) {
            if (a >= b) {
                b *= 2;
                k--;
            } else if (b >= c) {
                c *= 2;
                k--;
            } else {
                break;
            }
        }

        if (b > a && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
