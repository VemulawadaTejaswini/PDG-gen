
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner scan = new Scanner(System.in);
        int second = scan.nextInt();
        int hour = second /3600;
        int m = second % 3600;
        int minuit = m /60;
        int b = m % 60;
        System.out.printf("%d:%d:%d\n",hour,minuit,b);
    
    }
}