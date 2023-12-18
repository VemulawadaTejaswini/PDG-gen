import java.util.*;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        out.print(getValue(n) * getValue(m));
    }

    private static long getValue(long i){
        if(i==1){
            return 1;
        }else if(i ==2){
            return 0;
        }
        return i - 2;    }
}