import java.util.*;


public class Main {
    public static long count(long b, long l){
        if(b==0){
            return 0;
        }
        return (l/b)*b + count(l%b,b)+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();

        System.out.println(n+count(x,n-x));

    }
}
