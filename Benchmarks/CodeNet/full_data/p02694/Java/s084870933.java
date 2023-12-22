import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long K = in.nextLong();
        long current = 100;
        int res = 0;
        while (current < K) {
            current = (long)(current * 1.01);
            res++;
        }
        System.out.println(res);
    }
}