import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long min = Long.MAX_VALUE;
        long amari = 0;

        if(n>k){
            min = n%k;
            if(k-min < min){
                min = k-min;
            }
        }else if(n==k){
            min=0;
        }else{
            min = n%k;
        }
        System.out.println(min);
    }
}