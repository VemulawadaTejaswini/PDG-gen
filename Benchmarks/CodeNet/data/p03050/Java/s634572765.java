import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        sc.close();

        long sum = 0;

        long limit = N;
        long i = 1;
        while(i <= limit){
            long m = (N-i)/i;
            if(m > i && (N-i)%i == 0)
                sum += m;
            i++;
            limit = m;
        }
        System.out.println(sum);
    }
}