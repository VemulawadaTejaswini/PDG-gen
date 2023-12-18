import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = 1;
        int count = 1;
        if(a < b){
            c = a;
            a = b;
            b = c;
        }
        while(a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        if(c % 2 == 0){
            c = c / 2;
            count += 1;
        }
        while(c % 2 == 0){
            c = c / 2;
        }
        for(long i = 3; i <= c; i += 2){
            if(c % i == 0){
                c = c / i;
                count += 1;
            }
            while(c % i == 0){
                c = c / i;
            }
        }
        System.out.println(count);
    }
}