import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long l = (long)(Math.ceil(Math.sqrt(a)));

        long min = Long.MAX_VALUE;
        long x;
        for(long i = 1; i <= l; i++){
            if(a % i == 0){
                x = a / i;
                min = Math.min(min, (x + i - 2));
            }
        }

        System.out.println(min);

    }

}
