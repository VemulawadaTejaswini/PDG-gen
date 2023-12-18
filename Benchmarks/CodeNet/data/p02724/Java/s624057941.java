import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long hap = 1000*(n/500) + 5*((n%500)/5);
        System.out.println(hap);
    }
}