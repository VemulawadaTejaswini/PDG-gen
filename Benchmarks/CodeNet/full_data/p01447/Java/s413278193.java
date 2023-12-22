import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long n = sc.nextLong();
        int res = 0;
        while (true) {
            n = (n + 2)/3;
            res++;
            
            if(n == 2 || n == 3) {
                res++;
                break;
            }
        }
        
        System.out.println(res);
    }
}