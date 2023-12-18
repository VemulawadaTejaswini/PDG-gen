import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        sum = n/2*(n-1);
        System.out.print(sum);
    }
}