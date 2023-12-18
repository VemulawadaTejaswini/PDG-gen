import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();

        long sum = 0;
        sc.close();

        if(N / 10 == 0){
            sum = N;
        } else{
            while(N/10 != 0){
                sum += 9;
                N /= 10;
            }
            sum += N-1;
        }

        System.out.println(sum);
    }
}