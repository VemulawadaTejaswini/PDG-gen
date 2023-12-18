import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long val = log2(n);
        long dd = (long) Math.pow(2, val+1);
        System.out.println((long) dd-1);
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}