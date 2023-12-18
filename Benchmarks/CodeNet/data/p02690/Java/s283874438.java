import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        boolean found = false;

        final long A_MAX = 1000;
        final long B_MAX = 1000;

        for(long a = 0 ; a <= A_MAX && !found ; a++){
            for(long b = -B_MAX ; b <= B_MAX && !found ; b++){
                if(pow5th(a)-pow5th(b) == X){
                    System.out.println(""+a+" "+b);
                    found = true;
                }
            }
        }
    }

    public static long pow5th(long val){
        HashMap<Long, Long> log = new HashMap<>();
        if(log.containsKey(val)){
            return log.get(val);
        }
        long result = val*val;
        result = result*result*val;
        log.put(val, result);
        return result;
    }
}
