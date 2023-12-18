import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();

        long sum = 0;
        sc.close();
        int count = 0;
        int count9 = 0;

        if(N / 10 == 0){
            sum = N;
        } else{
            while(N/10 != 0){
                count++;
                if(N%10 == 9)
                    count9++;
                sum += 9;
                N /= 10;
            }
            if(count9 != count)
                sum += N-1;
            else
                sum += N;
        }

        System.out.println(sum);
    }
}