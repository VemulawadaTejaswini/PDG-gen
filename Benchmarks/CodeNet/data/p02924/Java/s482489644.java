import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(N == 1L){
            System.out.println(0);
        }else{
            System.out.println((long)(((double)N - 1.0) / 2.0 * (double)N));
        }
    }
    
}
