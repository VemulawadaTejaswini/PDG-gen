import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long X = scan.nextLong();
        if(N == 0){
            System.out.println(0);
        }
        else{
            System.out.println(Hamb(N,X));
        }
    }
    static long Hamb(int N, long X){
        if(N <= 0){
            return 1;
        }
        long thick = HambThickness(N-1);
        if(X == 1){
            return 0;
        }
        else if(X <= 1 + thick){
            return Hamb(N-1,X-1);
        }
        else if(X == 2 + thick){
            return Patty(N-1)+1;
        }
        else if(X < 2 + 2 * thick){
            return Patty(N-1) + 1 + Hamb(N-1, X - 2 - thick);
        }
        else{
            return 2 * Patty(N-1) + 1;
        }
    }
    static long HambThickness(int N){
        if(N <= 0){
            return 1;
        }
        else{
            return (2 * HambThickness(N-1) + 3);
        }
    }
    static long Patty(int N){
        if(N <= 0){
            return 1;
        }
        else{
            return (2 * Patty(N-1) + 1);
        }
    }
}
