import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long lb = (long)(b * 100);
        System.out.println(lb);
        long result = (a * lb) / 100;

        System.out.println(result);
    }
}