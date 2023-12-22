import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long d = 100;
        int count = 0;
        while(d<x) {
            d = (long)Math.floor(d * 1.01);
            count++;
        }
        System.out.println(count);
    }
}
