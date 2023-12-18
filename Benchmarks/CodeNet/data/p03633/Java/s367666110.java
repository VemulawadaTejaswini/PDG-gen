
import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ary = new long[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextLong();
        }
        sort(ary);
        long tmp = 1;
        for(int i = 0;i < n;i++){
            tmp = lcm(tmp,ary[i]);
        }
        System.out.print(tmp);
    }
    static long gcd(long a,long b){
    long candidate = a;
    while (b % a != 0) {
      candidate = b % a;
      b = a;
      a = candidate;
    }
    return candidate;
  }
    
    static long lcm(long a,long b){
        return a/gcd(a,b) * b;
    }
}

