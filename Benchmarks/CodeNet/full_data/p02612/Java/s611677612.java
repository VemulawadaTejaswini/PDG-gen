
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        System.out.println(Math.abs(1000-testCases%1000));
   }
}
