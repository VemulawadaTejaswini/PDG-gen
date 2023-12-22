
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++) {
            int sum = 0;
            String x = sc.next();
            if(x == "0") break;
            for(int j = 0; j < x.length(); j++) {
                sum += x.charAt(j) - '0';
            }
            System.out.println(sum);
        }
    }
}
