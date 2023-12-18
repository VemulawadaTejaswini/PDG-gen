import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        if(A+B>0){    
            if(N%(A+B)<A){
                System.out.println((N - N % (A + B)) * A / (A + B) + N % (A + B));
            }
            else{
                System.out.println((N - N % (A + B)) * A / (A + B) + A);
            }
        }
        else{
            System.out.println(0);
        }
    }
}