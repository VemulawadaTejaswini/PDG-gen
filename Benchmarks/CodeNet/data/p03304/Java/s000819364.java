
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        long m=scanner.nextLong();
        long d=scanner.nextLong();
        System.out.println(func(n,d)*(m-1)/Math.pow(n,2));
    }
    public static long func(long n,long d){
        if(d==0){
            return n;
        }
        return (n-d)*2;
    }
}