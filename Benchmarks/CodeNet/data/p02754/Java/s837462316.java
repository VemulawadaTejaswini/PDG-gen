
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        long aa=n%(long)((long)a+(long)b);
        long as=(long)((long)n/(long)((long)a+(long)b));
        long ans=(long)((long)((long)as*(long)a)+ (long)Math.min((long)aa,(long)a));
        System.out.println(ans);
    }
}
