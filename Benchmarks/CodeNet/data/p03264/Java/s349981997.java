import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double a = (num);
        double b = a/2;
        int x = Math.ceil(b);
        int y = Math.floor(b);
        int z = x * y;
        System.out.print(z);
        scan.close();
    }
}