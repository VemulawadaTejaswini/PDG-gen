import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int W = scan.nextInt();
        if (S > W) {
            System.out.println("safe");
        }
        else {
            System.out.println("unsafe");
        }
        scan.close();
    }
}
