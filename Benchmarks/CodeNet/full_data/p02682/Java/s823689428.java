import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        int max = 0;
        if (k <= a + b) {
            max = a;
        } else {
            max = a - (k - a - b);
        }
        System.out.println(max);
    }
}