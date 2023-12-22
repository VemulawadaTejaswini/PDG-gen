
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long a = sc.nextLong();
    static long b = sc.nextLong();
    static long n = sc.nextLong();
    static long result = 0;
    public static void main(String[] args) {

        for (long i = n; i >= n - a; i--){
            if (a * i >= b){
                if (result <= (a * i / b - a * (i / b))){
                    result = (a * i / b - a * (i / b));
                }
            }
        }
        System.out.println(result);
    }

}
