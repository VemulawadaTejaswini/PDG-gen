import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        long H = sc.nextLong();
        long W = sc.nextLong();
        sc.close();

        long n1 = (H - 1) / 2 + 1;
        long n2 = H / 2;
        n1 *= (W / 2 + W % 2);
        n2 *= W / 2;
        long sum = n1 + n2;

        System.out.println(sum);
    }
}