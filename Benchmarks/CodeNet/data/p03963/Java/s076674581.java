import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        System.out.println(k*pow(k-1, n-1));
    }

    public static long pow(long a, long b){
        long result = 1;
        for(long i=0;i<b;i++){
            result *= a;
        }
        return result;
    }
}