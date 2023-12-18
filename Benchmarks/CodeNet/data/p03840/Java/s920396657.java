import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long i = sc.nextLong();
        long o = sc.nextLong();
        long t = sc.nextLong();
        long j = sc.nextLong();
        long l = sc.nextLong();
        long s = sc.nextLong();
        long z = sc.nextLong();
        long ret = 0;
        ret += o;
        long temp = 0;
        if (i>0&&j>0&&l>0) {
            temp = Math.max(temp, (i-1)/2*2+(j-1)/2*2+(l-1)/2*2+3);
        }
        temp = Math.max(temp, i/2*2+j/2*2+l/2*2);
        ret += temp;
        
        System.out.println(ret);
    }
}
