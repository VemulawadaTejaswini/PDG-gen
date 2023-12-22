import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int minN = 1;
        int maxN = 10000;
        if(N < minN || N > maxN ){
            return;
        }

        if(N % 1000 == 0){
            System.out.println(0);
        }else{
            System.out.println( 1000 - N % 1000 );
        }
    }
}