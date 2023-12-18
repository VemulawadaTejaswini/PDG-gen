import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();

        long min = Long.MAX_VALUE;

        while(true){
            n  = Math.abs(n - k);
            //System.out.println(n);
            if(n < min){
                min = n;
            }else{
                break;
            }

        }
        System.out.println(min);
    }
}