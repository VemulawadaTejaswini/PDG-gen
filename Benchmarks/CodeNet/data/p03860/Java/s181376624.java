import java.util.Scanner;

/**
 * @Author oreid
 * @Release 04/12/2016
 */
public class MainA1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        String x = scanner.next();

        scanner.close();

        System.out.println("A"+ x.charAt(0) + "C");
    }
}