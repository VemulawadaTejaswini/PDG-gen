import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        int sum = 0;

        if(a + b > k){
            sum = a;
        }else{
            sum = a - (k - a - b);
        }

        System.out.println(sum);

        scan.close();
    }
}