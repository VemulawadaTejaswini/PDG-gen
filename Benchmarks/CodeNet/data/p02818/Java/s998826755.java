import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        long A = stdIn.nextLong();
        long B = stdIn.nextLong();
        long K = stdIn.nextLong();
        long N_A=0;
        long N_B=0;

        if(A>K){
            N_A = A-K;
            N_B = B;
        }
        else{
            N_A = 0;
            if(B-(K-A) >0)
                N_B = B-(K-A);
            else
                N_B = 0;
        }
        System.out.print(N_A+" "+ N_B);
    }
}