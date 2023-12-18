import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        long N = sc.nextLong();
        long A;
        long B;
        long max = 0;

        if(N==1){
            System.out.println(1);
            return;
        }
        for(long i=1; i<=N; i++){
            A = i;
            B = N / A;
            if(A>B){
                System.out.println(String.valueOf(max).length());
                break;
            }
            else{
                if(N%A==0){
                    max = 0;
                    max = Math.max(A, B);
                }
            }
        }
    }
}