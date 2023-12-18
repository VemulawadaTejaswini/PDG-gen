import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        long N = sc.nextLong();
        long M = sc.nextLong();

        if(N>=M / 2){
            System.out.println(M / 2);
        }
        else{
            long x = (M - 2 * N) / 4;
            System.out.println(x + N);
        }
    }
}