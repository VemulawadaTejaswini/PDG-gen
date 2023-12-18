import java.util.*;
import java.lang.*;


public class Main {
    static void answer(int X){
        System.out.println(X);
        System.exit(0);
    }
    static void impossible(){
        System.out.println(":(");
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int x=1; x<100000; x++){
            int n = x*108/100;
            if(n==N) answer(x);
        }
        impossible();
    }
}
