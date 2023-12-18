import java.util.Scanner;
 
public class InputSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
 
        System.out.println(num * 2 * 3.14);
        scan.close();
    }
}