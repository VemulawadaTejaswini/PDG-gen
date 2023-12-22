import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        long result = 1;
        long x = (long)Math.pow(10, 18);
        int flag = 0;

        for(int n=0; n<N; n++){
            long A = sn.nextLong();
            result *= A;
        }

        if(result <= x){
            System.out.println(result);
        }
        else System.out.println(-1);
    }
}