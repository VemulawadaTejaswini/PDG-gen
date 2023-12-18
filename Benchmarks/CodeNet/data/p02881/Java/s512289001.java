import java.lang.Math;
import java.util.*;
class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long temp = N;
        for(long i = 1; i <= Math.sqrt(N); i++){
            if( N % i == 0 && N/i + i < temp){

                temp = N/i + i;
            }
        }
        if(temp == N){
            System.out.println(N-1);
        }else System.out.println(temp - 2);
     }
}