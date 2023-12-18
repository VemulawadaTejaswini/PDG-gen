
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long A,B,C,K;
        A= input.nextLong();
        B= input.nextLong();
        C= input.nextLong();
        K= input.nextLong();
        if(A>B)
            System.out.println(A);
        else if(B>A)
            System.out.println(0);
    }
    
}
