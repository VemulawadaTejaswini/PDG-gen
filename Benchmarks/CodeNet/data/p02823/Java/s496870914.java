import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long awin = B-1;
        long alose = N-A;
        long odd = (B-A-1)%2 == 1 ? (B-A)/2 : Long.MAX_VALUE;

        System.out.println(Math.min(Math.min(awin, alose), odd));
    }
}
