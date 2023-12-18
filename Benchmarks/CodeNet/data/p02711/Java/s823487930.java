import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        while(n > 0) {
            if(n % 10 == 7) {
                System.out.println("Yes");
                return;
            }
            n /= 10;
        }
        System.out.println("No");
    }
}
