import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if(k <= a){
            System.out.print((a - k) + " ");
            System.out.println((b));
        }else if(k <= (a + b)){
            System.out.print(0 + " ");
            System.out.println((a + b - k));
        }else{
            System.out.print(0 + " ");
            System.out.println(0);
        }
    }
}