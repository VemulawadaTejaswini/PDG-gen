import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        long a, b, ret;
        in = scanner.nextLine().split(" ");
        a = Long.parseLong(in[0]);
        b = Long.parseLong(in[1]);
        if(a == b){
        	System.out.println(a);
        	return;
        }
 
//        ret = f(b) ^ f(a-1);
// 
//        System.out.println(ret);
        long result = 0;
        for(long x = a; x <=b; x++){
        	result ^= x;
        }
        System.out.println(result);
    }
}