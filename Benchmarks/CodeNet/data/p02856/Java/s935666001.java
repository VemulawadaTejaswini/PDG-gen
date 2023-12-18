import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int digits = 0;
        long n9 = 0;
        long r9 = 0;
        for(int i=0; i<m; i++) {
            int d = sc.nextInt();
            long c = sc.nextLong();
            digits += c;
            r9 += c * d;
            n9 += r9 / 9;
            r9 = r9 % 9;
        }
        if(r9 == 0) {
            n9--;
        }
        long res = digits - 1 + n9;

        System.out.println(res);
    }
}
