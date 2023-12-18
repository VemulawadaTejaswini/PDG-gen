import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count=0;
        count = n%(a+b);
        if (count<a){
            count = ((n-count)/(a+b))*a + n - count;
        }
        System.out.println(count);
    }

}