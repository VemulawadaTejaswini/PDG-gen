import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        if(a >= k){
            System.out.println(k);
        }
        else if(a + b >= k){
            System.out.println(a);
        }
        else{
            long temp = k - a - b;
            System.out.println(a - temp);
        }
    }
}