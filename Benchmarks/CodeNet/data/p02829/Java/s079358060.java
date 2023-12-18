import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC148A - Round One

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        if (a == 1 && b == 2 || a == 2 && b == 1) {
            ans = 3;
        } else if (a == 1 && b == 3 || a == 3 && b == 1) {
            ans = 2;
        } else {
            ans = 1;
        }
        
        
        System.out.println(ans);
    }
}