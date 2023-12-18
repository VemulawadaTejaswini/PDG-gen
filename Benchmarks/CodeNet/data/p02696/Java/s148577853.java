import java.util.*;

public class Main{
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long max = 0;
        for(long i = 1; i <= n; i++){
            long temp = a*i/b - i/b * a;
            if(temp < max) {
                break;
            }
            max = temp;
        }
        System.out.println(max);
    }
}