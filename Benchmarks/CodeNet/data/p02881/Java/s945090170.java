import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long c = 0;
        long min = 0;
        long d = 0;
        for(long i = 1; i < N; i++){
            for(long j = i; j < N; j++){
                c = i*j;
                if(c == N){
                    d = i+j-2;
                    if(min == 0 || min > d) min = d;
            }
        }
    }
    System.out.print(min);

    }
}