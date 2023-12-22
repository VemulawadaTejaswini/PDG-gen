import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int  a = d % 10;

        if(a == 3) {
            System.out.println("bon");
        } else if( a== 0 || a == 1 || a == 6 || a == 8) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }

    static int getDigit(int n) {
        int d = 0;
        while(n > 0){
            d = n % 10;
            n /= 10;
        }
        return d;
    }
}