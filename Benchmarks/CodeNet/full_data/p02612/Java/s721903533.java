import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int minN = 1;
        int maxN = 10000;
        if(N < minN || N > maxN ){
            System.out.println("Error");
            return;
        }

        System.out.println( 1000 - N % 1000 );
    }
}