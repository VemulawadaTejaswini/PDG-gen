import java.util.*;

public class Main{
    static int n;
    static int f;
    static Scanner sc = new Scanner(System.in);
    static int count;
    public static void main(String[] args){
        n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n < 2){
            return 1;
        }else{
            int f = 1;
            int f1 = 1;
            int f2;
            for(int i=2; i<=n; i++){
                f2 = f1;
                f1 = f;
                f = f1 + f2;
            }
            return f;
        }
    } 
}
