import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        long out = 0;
        long[] h =  new long[(int)n];
        for(int i = 0; i < n; i++){
            h[i] = scan.nextLong();
        }
        Arrays.sort(h);
        for(int i = 0 ; i < n - k; i++){
            out += h[i];
        }
        System.out.println(out);
    }
}