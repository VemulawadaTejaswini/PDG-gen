import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long a = 100;
        int res = 0;
        while(a < t) {
            a += a/100;
            res++;
        }
        System.out.println(res);
    }
}