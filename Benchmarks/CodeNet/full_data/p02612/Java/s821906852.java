import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = 0;
        int M = 0;

        N = sc.nextInt();

        M = N % 1000;

        if ( M == 0 ){
            System.out.println(0);
        }else{
            System.out.println(M);
        }
    }
}
