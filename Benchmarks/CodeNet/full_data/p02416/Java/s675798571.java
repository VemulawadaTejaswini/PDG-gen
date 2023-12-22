import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int n = sc.nextInt();
            if(n == 0) break;
            int s = 0;
            while(n != 0) {
                s += (n % 10);
                n /= 10;
            }
            System.out.println(s);
        }
    }
}