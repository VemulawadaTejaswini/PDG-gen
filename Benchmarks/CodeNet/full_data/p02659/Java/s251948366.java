import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long    a = sc.nextLong();
        double  b = sc.nextDouble();
        b *= (double)a;
        System.out.println((long)b);
    }
}