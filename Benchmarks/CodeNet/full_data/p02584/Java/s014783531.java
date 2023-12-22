import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        long x = Long.parseLong(sn.next());
        Long k = Long.parseLong(sn.next());
        long d = Long.parseLong(sn.next());
        long c = 0;
        long left = 0;
        long right = 0;
        long k2 = 0;
        
        if ( x > d) {
            left = x;
            right = d;
        } else {
            left = d;
            right = x;            
        }
        
        for ( int i = 0; i < k; i++){
            if ( left - right > 0){
                left = left - right;
            } else {
                break;
            }
            k2 = k -1;
        }


        if (k2 % 2 == 0){
            right = right * 2;
        }

        if ( left > right) {
            c = left - right;
        } else {
            c = right - left;
        }
        System.out.println(c);
    }
}
