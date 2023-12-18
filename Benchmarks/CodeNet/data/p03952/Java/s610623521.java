import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        scan.close();
        if (x == 1 || x == n * 2 - 1) {
            System.out.println("No");
        } else if (n == x) {
            System.out.println("Yes");
            for (int i = 1; i < n * 2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Yes");
            for (int i = 2; i < n * 2; i++) {
                if (n == i || x == i || i == 1) {                    
                }else if (n+1 == i) {
                    System.out.println(i);
                    System.out.println(1);
                    System.out.println(x);
                }else{
                    System.out.println(i);
                }
            }
            System.out.println(n);
        }
    }
}
