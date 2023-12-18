import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ballsLeft = n% (a+b);
        int times = n / (a+b);
        if (ballsLeft >= a) {
            System.out.println(a * (times + 1));
        }
        else {
            System.out.println(a * (times) + (ballsLeft));
        }
    }
}