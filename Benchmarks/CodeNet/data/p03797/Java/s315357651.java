import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long count = 0;
        while(n != 0 && m >= 2) {
            n--;
            m -= 2;
            count++;
        }
        if(n == 0) {
            while(m >= 4) {
                m -= 4;
                count++;
            }
        }
        System.out.println(count);
    }
}
