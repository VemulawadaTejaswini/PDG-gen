import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        long K = scan.nextLong();
        long D = scan.nextLong();
        long num1 = 0;
        long num2 = 0;
        for(int i = 0; i < K; i++){
            num1 = X+D;
            num2 = X-D;
            if(Math.abs(num1) < Math.abs(num2)) X = num1;
            else X = num2;
        }
        System.out.println(X);
        
    }
}