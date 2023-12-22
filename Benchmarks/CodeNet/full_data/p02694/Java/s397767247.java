import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long n = 100;

        long count = 0;
        while(n < x){
            n += n / 100;
            count++;
        }
        System.out.println(count);

    }
}
