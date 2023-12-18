
import java.util.Scanner;

public final  class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long diff=Math.abs(n-k);
        long min=Math.min(k%diff,diff%k);
        System.out.println(min);
    }
}
